// $ANTLR 3.4 C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g 2012-11-22 23:25:29

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "LETTER", "NUMBER", "STRING", "WS", "'!'", "'!='", "'%'", "'&&'", "'&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'<'", "'<='", "'=='", "'>'", "'>='", "'?'", "'Alice'", "'The'", "'\\'s'", "'^'", "'and'", "'ate'", "'became'", "'because Alice was unsure which'", "'because'", "'but'", "'closed'", "'contained a'", "'drank'", "'either'", "'enough times'", "'eventually'", "'found'", "'had'", "'letter'", "'looking-glass'", "'number'", "'of'", "'opened'", "'or maybe'", "'or'", "'perhaps'", "'piece'", "'room'", "'said Alice'", "'sentence'", "'so'", "'spider'", "'spoke'", "'then'", "'too'", "'was a'", "'what was'", "'|'", "'||'", "'~'"
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:18:1: rule : ( STRING )* ;
    public final malice_grammarParser.rule_return rule() throws RecognitionException {
        malice_grammarParser.rule_return retval = new malice_grammarParser.rule_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRING1=null;

        CommonTree STRING1_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:18:5: ( ( STRING )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:18:7: ( STRING )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:18:7: ( STRING )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:18:7: STRING
            	    {
            	    STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_rule58); if (state.failed) return retval;
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:28:1: lpar : '(' ;
    public final malice_grammarParser.lpar_return lpar() throws RecognitionException {
        malice_grammarParser.lpar_return retval = new malice_grammarParser.lpar_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal2=null;

        CommonTree char_literal2_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:28:5: ( '(' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:28:7: '('
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal2=(Token)match(input,14,FOLLOW_14_in_lpar182); if (state.failed) return retval;
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:29:1: rpar : ')' ;
    public final malice_grammarParser.rpar_return rpar() throws RecognitionException {
        malice_grammarParser.rpar_return retval = new malice_grammarParser.rpar_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal3=null;

        CommonTree char_literal3_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:29:5: ( ')' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:29:7: ')'
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal3=(Token)match(input,15,FOLLOW_15_in_rpar189); if (state.failed) return retval;
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:30:1: mono_op : '~' ;
    public final malice_grammarParser.mono_op_return mono_op() throws RecognitionException {
        malice_grammarParser.mono_op_return retval = new malice_grammarParser.mono_op_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal4=null;

        CommonTree char_literal4_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:30:9: ( '~' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:30:11: '~'
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal4=(Token)match(input,67,FOLLOW_67_in_mono_op197); if (state.failed) return retval;
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:31:1: bin_op : ( '+' | '-' | '%' | '/' | '*' | '^' | '&' | '|' );
    public final malice_grammarParser.bin_op_return bin_op() throws RecognitionException {
        malice_grammarParser.bin_op_return retval = new malice_grammarParser.bin_op_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set5=null;

        CommonTree set5_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:31:8: ( '+' | '-' | '%' | '/' | '*' | '^' | '&' | '|' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set5=(Token)input.LT(1);

            if ( input.LA(1)==11||input.LA(1)==13||(input.LA(1) >= 16 && input.LA(1) <= 17)||input.LA(1)==19||input.LA(1)==21||input.LA(1)==31||input.LA(1)==65 ) {
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:32:1: relational_ops : ( '==' | '!=' | '<' | '>' | '<=' | '>=' );
    public final malice_grammarParser.relational_ops_return relational_ops() throws RecognitionException {
        malice_grammarParser.relational_ops_return retval = new malice_grammarParser.relational_ops_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set6=null;

        CommonTree set6_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:32:16: ( '==' | '!=' | '<' | '>' | '<=' | '>=' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set6=(Token)input.LT(1);

            if ( input.LA(1)==10||(input.LA(1) >= 22 && input.LA(1) <= 26) ) {
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:33:1: array_elem : IDENT '\\'s' expr 'piece' ;
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
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:33:12: ( IDENT '\\'s' expr 'piece' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:33:14: IDENT '\\'s' expr 'piece'
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_array_elem267); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT7_tree = 
            (CommonTree)adaptor.create(IDENT7)
            ;
            adaptor.addChild(root_0, IDENT7_tree);
            }

            string_literal8=(Token)match(input,30,FOLLOW_30_in_array_elem269); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal8_tree = 
            (CommonTree)adaptor.create(string_literal8)
            ;
            adaptor.addChild(root_0, string_literal8_tree);
            }

            pushFollow(FOLLOW_expr_in_array_elem271);
            expr9=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr9.getTree());

            string_literal10=(Token)match(input,54,FOLLOW_54_in_array_elem273); if (state.failed) return retval;
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:34:1: atom : ( IDENT ( '\\'s' expr 'piece' )? | NUMBER | function_call );
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
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:34:5: ( IDENT ( '\\'s' expr 'piece' )? | NUMBER | function_call )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENT) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1 >= 11 && LA3_1 <= 13)||(LA3_1 >= 15 && LA3_1 <= 23)||(LA3_1 >= 25 && LA3_1 <= 26)||(LA3_1 >= 30 && LA3_1 <= 32)||LA3_1==37||LA3_1==46||LA3_1==48||LA3_1==54||(LA3_1 >= 56 && LA3_1 <= 57)||(LA3_1 >= 60 && LA3_1 <= 61)||(LA3_1 >= 65 && LA3_1 <= 66)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==14) ) {
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
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:34:7: IDENT ( '\\'s' expr 'piece' )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    IDENT11=(Token)match(input,IDENT,FOLLOW_IDENT_in_atom279); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT11_tree = 
                    (CommonTree)adaptor.create(IDENT11)
                    ;
                    adaptor.addChild(root_0, IDENT11_tree);
                    }

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:34:13: ( '\\'s' expr 'piece' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==30) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:34:14: '\\'s' expr 'piece'
                            {
                            string_literal12=(Token)match(input,30,FOLLOW_30_in_atom282); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal12_tree = 
                            (CommonTree)adaptor.create(string_literal12)
                            ;
                            adaptor.addChild(root_0, string_literal12_tree);
                            }

                            pushFollow(FOLLOW_expr_in_atom284);
                            expr13=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr13.getTree());

                            string_literal14=(Token)match(input,54,FOLLOW_54_in_atom286); if (state.failed) return retval;
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
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:34:37: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NUMBER15=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom292); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER15_tree = 
                    (CommonTree)adaptor.create(NUMBER15)
                    ;
                    adaptor.addChild(root_0, NUMBER15_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:34:46: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_call_in_atom296);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:60:1: logical_ops : ( '&&' | '||' | '!' );
    public final malice_grammarParser.logical_ops_return logical_ops() throws RecognitionException {
        malice_grammarParser.logical_ops_return retval = new malice_grammarParser.logical_ops_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set17=null;

        CommonTree set17_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:60:13: ( '&&' | '||' | '!' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set17=(Token)input.LT(1);

            if ( input.LA(1)==9||input.LA(1)==12||input.LA(1)==66 ) {
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:66:1: data_types : ( 'number' | 'letter' | 'sentence' );
    public final malice_grammarParser.data_types_return data_types() throws RecognitionException {
        malice_grammarParser.data_types_return retval = new malice_grammarParser.data_types_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set18=null;

        CommonTree set18_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:66:12: ( 'number' | 'letter' | 'sentence' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set18=(Token)input.LT(1);

            if ( input.LA(1)==46||input.LA(1)==48||input.LA(1)==57 ) {
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:70:1: term : ( atom | lpar expr rpar );
    public final malice_grammarParser.term_return term() throws RecognitionException {
        malice_grammarParser.term_return retval = new malice_grammarParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.atom_return atom19 =null;

        malice_grammarParser.lpar_return lpar20 =null;

        malice_grammarParser.expr_return expr21 =null;

        malice_grammarParser.rpar_return rpar22 =null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:70:6: ( atom | lpar expr rpar )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDENT||LA4_0==NUMBER) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
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
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:70:8: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_atom_in_term368);
                    atom19=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom19.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:70:15: lpar expr rpar
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_lpar_in_term372);
                    lpar20=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar20.getTree());

                    pushFollow(FOLLOW_expr_in_term374);
                    expr21=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr21.getTree());

                    pushFollow(FOLLOW_rpar_in_term376);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:71:1: unary_op : ( '~' | '-' )* term ;
    public final malice_grammarParser.unary_op_return unary_op() throws RecognitionException {
        malice_grammarParser.unary_op_return retval = new malice_grammarParser.unary_op_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set23=null;
        malice_grammarParser.term_return term24 =null;


        CommonTree set23_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:71:10: ( ( '~' | '-' )* term )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:71:12: ( '~' | '-' )* term
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:71:12: ( '~' | '-' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19||LA5_0==67) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            	    {
            	    set23=(Token)input.LT(1);

            	    if ( input.LA(1)==19||input.LA(1)==67 ) {
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


            pushFollow(FOLLOW_term_in_unary_op393);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:72:1: mult : unary_op ( ( '*' | '/' | '%' ) unary_op )* ;
    public final malice_grammarParser.mult_return mult() throws RecognitionException {
        malice_grammarParser.mult_return retval = new malice_grammarParser.mult_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set26=null;
        malice_grammarParser.unary_op_return unary_op25 =null;

        malice_grammarParser.unary_op_return unary_op27 =null;


        CommonTree set26_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:72:6: ( unary_op ( ( '*' | '/' | '%' ) unary_op )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:72:7: unary_op ( ( '*' | '/' | '%' ) unary_op )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unary_op_in_mult400);
            unary_op25=unary_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_op25.getTree());

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:72:16: ( ( '*' | '/' | '%' ) unary_op )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==11||LA6_0==16||LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:72:17: ( '*' | '/' | '%' ) unary_op
            	    {
            	    set26=(Token)input.LT(1);

            	    if ( input.LA(1)==11||input.LA(1)==16||input.LA(1)==21 ) {
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


            	    pushFollow(FOLLOW_unary_op_in_mult415);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:73:1: add : mult ( ( '+' | '-' ) mult )* ;
    public final malice_grammarParser.add_return add() throws RecognitionException {
        malice_grammarParser.add_return retval = new malice_grammarParser.add_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set29=null;
        malice_grammarParser.mult_return mult28 =null;

        malice_grammarParser.mult_return mult30 =null;


        CommonTree set29_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:73:5: ( mult ( ( '+' | '-' ) mult )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:73:7: mult ( ( '+' | '-' ) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_mult_in_add425);
            mult28=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult28.getTree());

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:73:12: ( ( '+' | '-' ) mult )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17||LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:73:13: ( '+' | '-' ) mult
            	    {
            	    set29=(Token)input.LT(1);

            	    if ( input.LA(1)==17||input.LA(1)==19 ) {
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


            	    pushFollow(FOLLOW_mult_in_add436);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:74:1: bitw_and : add ( '&' add )* ;
    public final malice_grammarParser.bitw_and_return bitw_and() throws RecognitionException {
        malice_grammarParser.bitw_and_return retval = new malice_grammarParser.bitw_and_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal32=null;
        malice_grammarParser.add_return add31 =null;

        malice_grammarParser.add_return add33 =null;


        CommonTree char_literal32_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:74:10: ( add ( '&' add )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:74:12: add ( '&' add )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_bitw_and446);
            add31=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add31.getTree());

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:74:16: ( '&' add )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:74:17: '&' add
            	    {
            	    char_literal32=(Token)match(input,13,FOLLOW_13_in_bitw_and449); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal32_tree = 
            	    (CommonTree)adaptor.create(char_literal32)
            	    ;
            	    adaptor.addChild(root_0, char_literal32_tree);
            	    }

            	    pushFollow(FOLLOW_add_in_bitw_and451);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:1: bitw_xor : bitw_and ( '^' bitw_and )* ;
    public final malice_grammarParser.bitw_xor_return bitw_xor() throws RecognitionException {
        malice_grammarParser.bitw_xor_return retval = new malice_grammarParser.bitw_xor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal35=null;
        malice_grammarParser.bitw_and_return bitw_and34 =null;

        malice_grammarParser.bitw_and_return bitw_and36 =null;


        CommonTree char_literal35_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:10: ( bitw_and ( '^' bitw_and )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:12: bitw_and ( '^' bitw_and )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bitw_and_in_bitw_xor461);
            bitw_and34=bitw_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_and34.getTree());

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:21: ( '^' bitw_and )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:75:22: '^' bitw_and
            	    {
            	    char_literal35=(Token)match(input,31,FOLLOW_31_in_bitw_xor464); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal35_tree = 
            	    (CommonTree)adaptor.create(char_literal35)
            	    ;
            	    adaptor.addChild(root_0, char_literal35_tree);
            	    }

            	    pushFollow(FOLLOW_bitw_and_in_bitw_xor466);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:76:1: bitw_or : bitw_xor ( '|' bitw_xor )* ;
    public final malice_grammarParser.bitw_or_return bitw_or() throws RecognitionException {
        malice_grammarParser.bitw_or_return retval = new malice_grammarParser.bitw_or_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal38=null;
        malice_grammarParser.bitw_xor_return bitw_xor37 =null;

        malice_grammarParser.bitw_xor_return bitw_xor39 =null;


        CommonTree char_literal38_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:76:9: ( bitw_xor ( '|' bitw_xor )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:76:11: bitw_xor ( '|' bitw_xor )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bitw_xor_in_bitw_or476);
            bitw_xor37=bitw_xor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitw_xor37.getTree());

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:76:20: ( '|' bitw_xor )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==65) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:76:21: '|' bitw_xor
            	    {
            	    char_literal38=(Token)match(input,65,FOLLOW_65_in_bitw_or479); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal38_tree = 
            	    (CommonTree)adaptor.create(char_literal38)
            	    ;
            	    adaptor.addChild(root_0, char_literal38_tree);
            	    }

            	    pushFollow(FOLLOW_bitw_xor_in_bitw_or481);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:1: expr : bitw_or ;
    public final malice_grammarParser.expr_return expr() throws RecognitionException {
        malice_grammarParser.expr_return retval = new malice_grammarParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.bitw_or_return bitw_or40 =null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:6: ( bitw_or )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:78:8: bitw_or
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bitw_or_in_expr492);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:80:1: bool_neg : ( '!' )* term ;
    public final malice_grammarParser.bool_neg_return bool_neg() throws RecognitionException {
        malice_grammarParser.bool_neg_return retval = new malice_grammarParser.bool_neg_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal41=null;
        malice_grammarParser.term_return term42 =null;


        CommonTree char_literal41_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:80:10: ( ( '!' )* term )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:80:12: ( '!' )* term
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:80:12: ( '!' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==9) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:80:12: '!'
            	    {
            	    char_literal41=(Token)match(input,9,FOLLOW_9_in_bool_neg500); if (state.failed) return retval;
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


            pushFollow(FOLLOW_term_in_bool_neg503);
            term42=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term42.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:81:1: bool_comp : bool_neg ( ( '<=' | '<' | '>' | '>=' ) bool_neg )* ;
    public final malice_grammarParser.bool_comp_return bool_comp() throws RecognitionException {
        malice_grammarParser.bool_comp_return retval = new malice_grammarParser.bool_comp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set44=null;
        malice_grammarParser.bool_neg_return bool_neg43 =null;

        malice_grammarParser.bool_neg_return bool_neg45 =null;


        CommonTree set44_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:81:11: ( bool_neg ( ( '<=' | '<' | '>' | '>=' ) bool_neg )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:81:13: bool_neg ( ( '<=' | '<' | '>' | '>=' ) bool_neg )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bool_neg_in_bool_comp511);
            bool_neg43=bool_neg();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_neg43.getTree());

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:81:22: ( ( '<=' | '<' | '>' | '>=' ) bool_neg )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= 22 && LA12_0 <= 23)||(LA12_0 >= 25 && LA12_0 <= 26)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:81:23: ( '<=' | '<' | '>' | '>=' ) bool_neg
            	    {
            	    set44=(Token)input.LT(1);

            	    if ( (input.LA(1) >= 22 && input.LA(1) <= 23)||(input.LA(1) >= 25 && input.LA(1) <= 26) ) {
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


            	    pushFollow(FOLLOW_bool_neg_in_bool_comp530);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:82:1: bool_eq : bool_comp ( ( '&&' | '||' ) bool_comp )* ;
    public final malice_grammarParser.bool_eq_return bool_eq() throws RecognitionException {
        malice_grammarParser.bool_eq_return retval = new malice_grammarParser.bool_eq_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set47=null;
        malice_grammarParser.bool_comp_return bool_comp46 =null;

        malice_grammarParser.bool_comp_return bool_comp48 =null;


        CommonTree set47_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:82:9: ( bool_comp ( ( '&&' | '||' ) bool_comp )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:82:11: bool_comp ( ( '&&' | '||' ) bool_comp )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bool_comp_in_bool_eq540);
            bool_comp46=bool_comp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_comp46.getTree());

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:82:21: ( ( '&&' | '||' ) bool_comp )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==12||LA13_0==66) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:82:22: ( '&&' | '||' ) bool_comp
            	    {
            	    set47=(Token)input.LT(1);

            	    if ( input.LA(1)==12||input.LA(1)==66 ) {
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


            	    pushFollow(FOLLOW_bool_comp_in_bool_eq551);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:1: bool_expr : bool_eq ;
    public final malice_grammarParser.bool_expr_return bool_expr() throws RecognitionException {
        malice_grammarParser.bool_expr_return retval = new malice_grammarParser.bool_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.bool_eq_return bool_eq49 =null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:11: ( bool_eq )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:84:13: bool_eq
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bool_eq_in_bool_expr562);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:98:1: control_structure : ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or maybe' lpar bool_expr rpar 'so' statementList )* 'or' statementList 'because Alice was unsure which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because Alice was unsure which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough times' ) ( '.' )? ;
    public final malice_grammarParser.control_structure_return control_structure() throws RecognitionException {
        malice_grammarParser.control_structure_return retval = new malice_grammarParser.control_structure_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal50=null;
        Token string_literal54=null;
        Token string_literal56=null;
        Token string_literal60=null;
        Token string_literal62=null;
        Token string_literal64=null;
        Token string_literal65=null;
        Token string_literal69=null;
        Token string_literal71=null;
        Token string_literal73=null;
        Token string_literal74=null;
        Token string_literal78=null;
        Token string_literal80=null;
        Token char_literal81=null;
        malice_grammarParser.lpar_return lpar51 =null;

        malice_grammarParser.bool_expr_return bool_expr52 =null;

        malice_grammarParser.rpar_return rpar53 =null;

        malice_grammarParser.statementList_return statementList55 =null;

        malice_grammarParser.lpar_return lpar57 =null;

        malice_grammarParser.bool_expr_return bool_expr58 =null;

        malice_grammarParser.rpar_return rpar59 =null;

        malice_grammarParser.statementList_return statementList61 =null;

        malice_grammarParser.statementList_return statementList63 =null;

        malice_grammarParser.lpar_return lpar66 =null;

        malice_grammarParser.bool_expr_return bool_expr67 =null;

        malice_grammarParser.rpar_return rpar68 =null;

        malice_grammarParser.statementList_return statementList70 =null;

        malice_grammarParser.statementList_return statementList72 =null;

        malice_grammarParser.lpar_return lpar75 =null;

        malice_grammarParser.bool_expr_return bool_expr76 =null;

        malice_grammarParser.rpar_return rpar77 =null;

        malice_grammarParser.statementList_return statementList79 =null;


        CommonTree string_literal50_tree=null;
        CommonTree string_literal54_tree=null;
        CommonTree string_literal56_tree=null;
        CommonTree string_literal60_tree=null;
        CommonTree string_literal62_tree=null;
        CommonTree string_literal64_tree=null;
        CommonTree string_literal65_tree=null;
        CommonTree string_literal69_tree=null;
        CommonTree string_literal71_tree=null;
        CommonTree string_literal73_tree=null;
        CommonTree string_literal74_tree=null;
        CommonTree string_literal78_tree=null;
        CommonTree string_literal80_tree=null;
        CommonTree char_literal81_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:99:4: ( ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or maybe' lpar bool_expr rpar 'so' statementList )* 'or' statementList 'because Alice was unsure which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because Alice was unsure which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough times' ) ( '.' )? )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:99:6: ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or maybe' lpar bool_expr rpar 'so' statementList )* 'or' statementList 'because Alice was unsure which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because Alice was unsure which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough times' ) ( '.' )?
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:99:6: ( 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or maybe' lpar bool_expr rpar 'so' statementList )* 'or' statementList 'because Alice was unsure which' | 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because Alice was unsure which' | 'eventually' lpar bool_expr rpar 'because' statementList 'enough times' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt15=1;
                }
                break;
            case 41:
                {
                alt15=2;
                }
                break;
            case 43:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:99:8: 'perhaps' lpar bool_expr rpar 'so' statementList ( 'or maybe' lpar bool_expr rpar 'so' statementList )* 'or' statementList 'because Alice was unsure which'
                    {
                    string_literal50=(Token)match(input,53,FOLLOW_53_in_control_structure588); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal50_tree = 
                    (CommonTree)adaptor.create(string_literal50)
                    ;
                    adaptor.addChild(root_0, string_literal50_tree);
                    }

                    pushFollow(FOLLOW_lpar_in_control_structure590);
                    lpar51=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar51.getTree());

                    pushFollow(FOLLOW_bool_expr_in_control_structure592);
                    bool_expr52=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr52.getTree());

                    pushFollow(FOLLOW_rpar_in_control_structure594);
                    rpar53=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar53.getTree());

                    string_literal54=(Token)match(input,58,FOLLOW_58_in_control_structure596); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal54_tree = 
                    (CommonTree)adaptor.create(string_literal54)
                    ;
                    adaptor.addChild(root_0, string_literal54_tree);
                    }

                    pushFollow(FOLLOW_statementList_in_control_structure604);
                    statementList55=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList55.getTree());

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:101:6: ( 'or maybe' lpar bool_expr rpar 'so' statementList )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==51) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:101:7: 'or maybe' lpar bool_expr rpar 'so' statementList
                    	    {
                    	    string_literal56=(Token)match(input,51,FOLLOW_51_in_control_structure613); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    string_literal56_tree = 
                    	    (CommonTree)adaptor.create(string_literal56)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal56_tree);
                    	    }

                    	    pushFollow(FOLLOW_lpar_in_control_structure615);
                    	    lpar57=lpar();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar57.getTree());

                    	    pushFollow(FOLLOW_bool_expr_in_control_structure617);
                    	    bool_expr58=bool_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr58.getTree());

                    	    pushFollow(FOLLOW_rpar_in_control_structure619);
                    	    rpar59=rpar();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar59.getTree());

                    	    string_literal60=(Token)match(input,58,FOLLOW_58_in_control_structure621); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    string_literal60_tree = 
                    	    (CommonTree)adaptor.create(string_literal60)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal60_tree);
                    	    }

                    	    pushFollow(FOLLOW_statementList_in_control_structure623);
                    	    statementList61=statementList();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList61.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    string_literal62=(Token)match(input,52,FOLLOW_52_in_control_structure632); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal62_tree = 
                    (CommonTree)adaptor.create(string_literal62)
                    ;
                    adaptor.addChild(root_0, string_literal62_tree);
                    }

                    pushFollow(FOLLOW_statementList_in_control_structure634);
                    statementList63=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList63.getTree());

                    string_literal64=(Token)match(input,35,FOLLOW_35_in_control_structure641); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal64_tree = 
                    (CommonTree)adaptor.create(string_literal64)
                    ;
                    adaptor.addChild(root_0, string_literal64_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:104:8: 'either' lpar bool_expr rpar 'so' statementList 'or' statementList 'because Alice was unsure which'
                    {
                    string_literal65=(Token)match(input,41,FOLLOW_41_in_control_structure650); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal65_tree = 
                    (CommonTree)adaptor.create(string_literal65)
                    ;
                    adaptor.addChild(root_0, string_literal65_tree);
                    }

                    pushFollow(FOLLOW_lpar_in_control_structure652);
                    lpar66=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar66.getTree());

                    pushFollow(FOLLOW_bool_expr_in_control_structure654);
                    bool_expr67=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr67.getTree());

                    pushFollow(FOLLOW_rpar_in_control_structure656);
                    rpar68=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar68.getTree());

                    string_literal69=(Token)match(input,58,FOLLOW_58_in_control_structure658); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal69_tree = 
                    (CommonTree)adaptor.create(string_literal69)
                    ;
                    adaptor.addChild(root_0, string_literal69_tree);
                    }

                    pushFollow(FOLLOW_statementList_in_control_structure666);
                    statementList70=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList70.getTree());

                    string_literal71=(Token)match(input,52,FOLLOW_52_in_control_structure675); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal71_tree = 
                    (CommonTree)adaptor.create(string_literal71)
                    ;
                    adaptor.addChild(root_0, string_literal71_tree);
                    }

                    pushFollow(FOLLOW_statementList_in_control_structure677);
                    statementList72=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList72.getTree());

                    string_literal73=(Token)match(input,35,FOLLOW_35_in_control_structure685); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal73_tree = 
                    (CommonTree)adaptor.create(string_literal73)
                    ;
                    adaptor.addChild(root_0, string_literal73_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:108:8: 'eventually' lpar bool_expr rpar 'because' statementList 'enough times'
                    {
                    string_literal74=(Token)match(input,43,FOLLOW_43_in_control_structure700); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal74_tree = 
                    (CommonTree)adaptor.create(string_literal74)
                    ;
                    adaptor.addChild(root_0, string_literal74_tree);
                    }

                    pushFollow(FOLLOW_lpar_in_control_structure702);
                    lpar75=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar75.getTree());

                    pushFollow(FOLLOW_bool_expr_in_control_structure704);
                    bool_expr76=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr76.getTree());

                    pushFollow(FOLLOW_rpar_in_control_structure706);
                    rpar77=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar77.getTree());

                    string_literal78=(Token)match(input,36,FOLLOW_36_in_control_structure708); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal78_tree = 
                    (CommonTree)adaptor.create(string_literal78)
                    ;
                    adaptor.addChild(root_0, string_literal78_tree);
                    }

                    pushFollow(FOLLOW_statementList_in_control_structure716);
                    statementList79=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList79.getTree());

                    string_literal80=(Token)match(input,42,FOLLOW_42_in_control_structure724); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal80_tree = 
                    (CommonTree)adaptor.create(string_literal80)
                    ;
                    adaptor.addChild(root_0, string_literal80_tree);
                    }

                    }
                    break;

            }


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:111:6: ( '.' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:111:6: '.'
                    {
                    char_literal81=(Token)match(input,20,FOLLOW_20_in_control_structure732); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal81_tree = 
                    (CommonTree)adaptor.create(char_literal81)
                    ;
                    adaptor.addChild(root_0, char_literal81_tree);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:1: declaration_statements : IDENT ( 'was a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types ) ;
    public final malice_grammarParser.declaration_statements_return declaration_statements() throws RecognitionException {
        malice_grammarParser.declaration_statements_return retval = new malice_grammarParser.declaration_statements_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT82=null;
        Token string_literal83=null;
        Token string_literal85=null;
        Token string_literal86=null;
        Token LETTER87=null;
        Token STRING88=null;
        Token string_literal90=null;
        malice_grammarParser.data_types_return data_types84 =null;

        malice_grammarParser.expr_return expr89 =null;

        malice_grammarParser.atom_return atom91 =null;

        malice_grammarParser.data_types_return data_types92 =null;


        CommonTree IDENT82_tree=null;
        CommonTree string_literal83_tree=null;
        CommonTree string_literal85_tree=null;
        CommonTree string_literal86_tree=null;
        CommonTree LETTER87_tree=null;
        CommonTree STRING88_tree=null;
        CommonTree string_literal90_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:24: ( IDENT ( 'was a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types ) )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:26: IDENT ( 'was a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types )
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT82=(Token)match(input,IDENT,FOLLOW_IDENT_in_declaration_statements747); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT82_tree = 
            (CommonTree)adaptor.create(IDENT82)
            ;
            adaptor.addChild(root_0, IDENT82_tree);
            }

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:32: ( 'was a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )? | 'had' atom data_types )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==63) ) {
                alt19=1;
            }
            else if ( (LA19_0==45) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:34: 'was a' data_types ( 'too' | 'of' ( LETTER | STRING | expr ) )?
                    {
                    string_literal83=(Token)match(input,63,FOLLOW_63_in_declaration_statements751); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal83_tree = 
                    (CommonTree)adaptor.create(string_literal83)
                    ;
                    adaptor.addChild(root_0, string_literal83_tree);
                    }

                    pushFollow(FOLLOW_data_types_in_declaration_statements753);
                    data_types84=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types84.getTree());

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:53: ( 'too' | 'of' ( LETTER | STRING | expr ) )?
                    int alt18=3;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==62) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==49) ) {
                        alt18=2;
                    }
                    switch (alt18) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:55: 'too'
                            {
                            string_literal85=(Token)match(input,62,FOLLOW_62_in_declaration_statements757); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal85_tree = 
                            (CommonTree)adaptor.create(string_literal85)
                            ;
                            adaptor.addChild(root_0, string_literal85_tree);
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:63: 'of' ( LETTER | STRING | expr )
                            {
                            string_literal86=(Token)match(input,49,FOLLOW_49_in_declaration_statements761); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal86_tree = 
                            (CommonTree)adaptor.create(string_literal86)
                            ;
                            adaptor.addChild(root_0, string_literal86_tree);
                            }

                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:68: ( LETTER | STRING | expr )
                            int alt17=3;
                            switch ( input.LA(1) ) {
                            case LETTER:
                                {
                                alt17=1;
                                }
                                break;
                            case STRING:
                                {
                                alt17=2;
                                }
                                break;
                            case IDENT:
                            case NUMBER:
                            case 14:
                            case 19:
                            case 67:
                                {
                                alt17=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 17, 0, input);

                                throw nvae;

                            }

                            switch (alt17) {
                                case 1 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:69: LETTER
                                    {
                                    LETTER87=(Token)match(input,LETTER,FOLLOW_LETTER_in_declaration_statements764); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    LETTER87_tree = 
                                    (CommonTree)adaptor.create(LETTER87)
                                    ;
                                    adaptor.addChild(root_0, LETTER87_tree);
                                    }

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:78: STRING
                                    {
                                    STRING88=(Token)match(input,STRING,FOLLOW_STRING_in_declaration_statements768); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    STRING88_tree = 
                                    (CommonTree)adaptor.create(STRING88)
                                    ;
                                    adaptor.addChild(root_0, STRING88_tree);
                                    }

                                    }
                                    break;
                                case 3 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:116:87: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_declaration_statements772);
                                    expr89=expr();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr89.getTree());

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
                    string_literal90=(Token)match(input,45,FOLLOW_45_in_declaration_statements812); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal90_tree = 
                    (CommonTree)adaptor.create(string_literal90)
                    ;
                    adaptor.addChild(root_0, string_literal90_tree);
                    }

                    pushFollow(FOLLOW_atom_in_declaration_statements814);
                    atom91=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom91.getTree());

                    pushFollow(FOLLOW_data_types_in_declaration_statements816);
                    data_types92=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types92.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:1: argument : ( IDENT | NUMBER | LETTER | STRING | array_elem );
    public final malice_grammarParser.argument_return argument() throws RecognitionException {
        malice_grammarParser.argument_return retval = new malice_grammarParser.argument_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT93=null;
        Token NUMBER94=null;
        Token LETTER95=null;
        Token STRING96=null;
        malice_grammarParser.array_elem_return array_elem97 =null;


        CommonTree IDENT93_tree=null;
        CommonTree NUMBER94_tree=null;
        CommonTree LETTER95_tree=null;
        CommonTree STRING96_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:9: ( IDENT | NUMBER | LETTER | STRING | array_elem )
            int alt20=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==30) ) {
                    alt20=5;
                }
                else if ( (LA20_1==15||LA20_1==18) ) {
                    alt20=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
                }
                break;
            case NUMBER:
                {
                alt20=2;
                }
                break;
            case LETTER:
                {
                alt20=3;
                }
                break;
            case STRING:
                {
                alt20=4;
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
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:11: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    IDENT93=(Token)match(input,IDENT,FOLLOW_IDENT_in_argument882); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT93_tree = 
                    (CommonTree)adaptor.create(IDENT93)
                    ;
                    adaptor.addChild(root_0, IDENT93_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:19: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NUMBER94=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_argument886); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER94_tree = 
                    (CommonTree)adaptor.create(NUMBER94)
                    ;
                    adaptor.addChild(root_0, NUMBER94_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:28: LETTER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LETTER95=(Token)match(input,LETTER,FOLLOW_LETTER_in_argument890); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LETTER95_tree = 
                    (CommonTree)adaptor.create(LETTER95)
                    ;
                    adaptor.addChild(root_0, LETTER95_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:37: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING96=(Token)match(input,STRING,FOLLOW_STRING_in_argument894); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING96_tree = 
                    (CommonTree)adaptor.create(STRING96)
                    ;
                    adaptor.addChild(root_0, STRING96_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:121:46: array_elem
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_array_elem_in_argument898);
                    array_elem97=array_elem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_elem97.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:1: arguments_to_functions : ( ( argument ( ',' argument )* )? | function_call );
    public final malice_grammarParser.arguments_to_functions_return arguments_to_functions() throws RecognitionException {
        malice_grammarParser.arguments_to_functions_return retval = new malice_grammarParser.arguments_to_functions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal99=null;
        malice_grammarParser.argument_return argument98 =null;

        malice_grammarParser.argument_return argument100 =null;

        malice_grammarParser.function_call_return function_call101 =null;


        CommonTree char_literal99_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:24: ( ( argument ( ',' argument )* )? | function_call )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IDENT) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==15||LA23_1==18||LA23_1==30) ) {
                    alt23=1;
                }
                else if ( (LA23_1==14) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;

                }
            }
            else if ( ((LA23_0 >= LETTER && LA23_0 <= STRING)||LA23_0==15) ) {
                alt23=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:26: ( argument ( ',' argument )* )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:26: ( argument ( ',' argument )* )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0 >= IDENT && LA22_0 <= STRING)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:27: argument ( ',' argument )*
                            {
                            pushFollow(FOLLOW_argument_in_arguments_to_functions906);
                            argument98=argument();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, argument98.getTree());

                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:36: ( ',' argument )*
                            loop21:
                            do {
                                int alt21=2;
                                int LA21_0 = input.LA(1);

                                if ( (LA21_0==18) ) {
                                    alt21=1;
                                }


                                switch (alt21) {
                            	case 1 :
                            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:37: ',' argument
                            	    {
                            	    char_literal99=(Token)match(input,18,FOLLOW_18_in_arguments_to_functions909); if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	    char_literal99_tree = 
                            	    (CommonTree)adaptor.create(char_literal99)
                            	    ;
                            	    adaptor.addChild(root_0, char_literal99_tree);
                            	    }

                            	    pushFollow(FOLLOW_argument_in_arguments_to_functions911);
                            	    argument100=argument();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, argument100.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop21;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:122:56: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_call_in_arguments_to_functions919);
                    function_call101=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call101.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:123:1: rest_statements : ( ( expr print )=> ( expr print ) | ( LETTER | STRING ) print | IDENT ( ( '\\'s' atom 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) ) | 'Alice' 'found' ( expr | LETTER | STRING ) | 'what was' IDENT '?' );
    public final malice_grammarParser.rest_statements_return rest_statements() throws RecognitionException {
        malice_grammarParser.rest_statements_return retval = new malice_grammarParser.rest_statements_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set104=null;
        Token IDENT106=null;
        Token string_literal107=null;
        Token string_literal109=null;
        Token string_literal110=null;
        Token LETTER112=null;
        Token STRING113=null;
        Token string_literal114=null;
        Token string_literal115=null;
        Token string_literal116=null;
        Token string_literal117=null;
        Token LETTER119=null;
        Token STRING120=null;
        Token string_literal121=null;
        Token IDENT122=null;
        Token char_literal123=null;
        malice_grammarParser.expr_return expr102 =null;

        malice_grammarParser.print_return print103 =null;

        malice_grammarParser.print_return print105 =null;

        malice_grammarParser.atom_return atom108 =null;

        malice_grammarParser.expr_return expr111 =null;

        malice_grammarParser.expr_return expr118 =null;


        CommonTree set104_tree=null;
        CommonTree IDENT106_tree=null;
        CommonTree string_literal107_tree=null;
        CommonTree string_literal109_tree=null;
        CommonTree string_literal110_tree=null;
        CommonTree LETTER112_tree=null;
        CommonTree STRING113_tree=null;
        CommonTree string_literal114_tree=null;
        CommonTree string_literal115_tree=null;
        CommonTree string_literal116_tree=null;
        CommonTree string_literal117_tree=null;
        CommonTree LETTER119_tree=null;
        CommonTree STRING120_tree=null;
        CommonTree string_literal121_tree=null;
        CommonTree IDENT122_tree=null;
        CommonTree char_literal123_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:123:17: ( ( expr print )=> ( expr print ) | ( LETTER | STRING ) print | IDENT ( ( '\\'s' atom 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) ) | 'Alice' 'found' ( expr | LETTER | STRING ) | 'what was' IDENT '?' )
            int alt28=5;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19||LA28_0==67) && (synpred1_malice_grammar())) {
                alt28=1;
            }
            else if ( (LA28_0==IDENT) ) {
                int LA28_2 = input.LA(2);

                if ( (synpred1_malice_grammar()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA28_0==NUMBER) && (synpred1_malice_grammar())) {
                alt28=1;
            }
            else if ( (LA28_0==14) && (synpred1_malice_grammar())) {
                alt28=1;
            }
            else if ( (LA28_0==LETTER||LA28_0==STRING) ) {
                alt28=2;
            }
            else if ( (LA28_0==28) ) {
                alt28=4;
            }
            else if ( (LA28_0==64) ) {
                alt28=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:123:21: ( expr print )=> ( expr print )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:123:38: ( expr print )
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:123:39: expr print
                    {
                    pushFollow(FOLLOW_expr_in_rest_statements938);
                    expr102=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr102.getTree());

                    pushFollow(FOLLOW_print_in_rest_statements940);
                    print103=print();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, print103.getTree());

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:124:9: ( LETTER | STRING ) print
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    set104=(Token)input.LT(1);

                    if ( input.LA(1)==LETTER||input.LA(1)==STRING ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set104)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_print_in_rest_statements965);
                    print105=print();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, print105.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:125:8: IDENT ( ( '\\'s' atom 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    IDENT106=(Token)match(input,IDENT,FOLLOW_IDENT_in_rest_statements974); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT106_tree = 
                    (CommonTree)adaptor.create(IDENT106)
                    ;
                    adaptor.addChild(root_0, IDENT106_tree);
                    }

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:9: ( ( '\\'s' atom 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' ) )
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:11: ( '\\'s' atom 'piece' )? ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' )
                    {
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:11: ( '\\'s' atom 'piece' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==30) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:126:12: '\\'s' atom 'piece'
                            {
                            string_literal107=(Token)match(input,30,FOLLOW_30_in_rest_statements987); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal107_tree = 
                            (CommonTree)adaptor.create(string_literal107)
                            ;
                            adaptor.addChild(root_0, string_literal107_tree);
                            }

                            pushFollow(FOLLOW_atom_in_rest_statements989);
                            atom108=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, atom108.getTree());

                            string_literal109=(Token)match(input,54,FOLLOW_54_in_rest_statements991); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal109_tree = 
                            (CommonTree)adaptor.create(string_literal109)
                            ;
                            adaptor.addChild(root_0, string_literal109_tree);
                            }

                            }
                            break;

                    }


                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:13: ( 'became' ( expr | LETTER | STRING ) | 'ate' | 'drank' )
                    int alt26=3;
                    switch ( input.LA(1) ) {
                    case 34:
                        {
                        alt26=1;
                        }
                        break;
                    case 33:
                        {
                        alt26=2;
                        }
                        break;
                    case 40:
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
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:18: 'became' ( expr | LETTER | STRING )
                            {
                            string_literal110=(Token)match(input,34,FOLLOW_34_in_rest_statements1012); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal110_tree = 
                            (CommonTree)adaptor.create(string_literal110)
                            ;
                            adaptor.addChild(root_0, string_literal110_tree);
                            }

                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:28: ( expr | LETTER | STRING )
                            int alt25=3;
                            switch ( input.LA(1) ) {
                            case IDENT:
                            case NUMBER:
                            case 14:
                            case 19:
                            case 67:
                                {
                                alt25=1;
                                }
                                break;
                            case LETTER:
                                {
                                alt25=2;
                                }
                                break;
                            case STRING:
                                {
                                alt25=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 25, 0, input);

                                throw nvae;

                            }

                            switch (alt25) {
                                case 1 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:29: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_rest_statements1016);
                                    expr111=expr();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr111.getTree());

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:36: LETTER
                                    {
                                    LETTER112=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements1020); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    LETTER112_tree = 
                                    (CommonTree)adaptor.create(LETTER112)
                                    ;
                                    adaptor.addChild(root_0, LETTER112_tree);
                                    }

                                    }
                                    break;
                                case 3 :
                                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:127:45: STRING
                                    {
                                    STRING113=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements1024); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    STRING113_tree = 
                                    (CommonTree)adaptor.create(STRING113)
                                    ;
                                    adaptor.addChild(root_0, STRING113_tree);
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:128:18: 'ate'
                            {
                            string_literal114=(Token)match(input,33,FOLLOW_33_in_rest_statements1045); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal114_tree = 
                            (CommonTree)adaptor.create(string_literal114)
                            ;
                            adaptor.addChild(root_0, string_literal114_tree);
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:129:18: 'drank'
                            {
                            string_literal115=(Token)match(input,40,FOLLOW_40_in_rest_statements1065); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal115_tree = 
                            (CommonTree)adaptor.create(string_literal115)
                            ;
                            adaptor.addChild(root_0, string_literal115_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:7: 'Alice' 'found' ( expr | LETTER | STRING )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal116=(Token)match(input,28,FOLLOW_28_in_rest_statements1119); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal116_tree = 
                    (CommonTree)adaptor.create(string_literal116)
                    ;
                    adaptor.addChild(root_0, string_literal116_tree);
                    }

                    string_literal117=(Token)match(input,44,FOLLOW_44_in_rest_statements1121); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal117_tree = 
                    (CommonTree)adaptor.create(string_literal117)
                    ;
                    adaptor.addChild(root_0, string_literal117_tree);
                    }

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:23: ( expr | LETTER | STRING )
                    int alt27=3;
                    switch ( input.LA(1) ) {
                    case IDENT:
                    case NUMBER:
                    case 14:
                    case 19:
                    case 67:
                        {
                        alt27=1;
                        }
                        break;
                    case LETTER:
                        {
                        alt27=2;
                        }
                        break;
                    case STRING:
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
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:24: expr
                            {
                            pushFollow(FOLLOW_expr_in_rest_statements1124);
                            expr118=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr118.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:31: LETTER
                            {
                            LETTER119=(Token)match(input,LETTER,FOLLOW_LETTER_in_rest_statements1128); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            LETTER119_tree = 
                            (CommonTree)adaptor.create(LETTER119)
                            ;
                            adaptor.addChild(root_0, LETTER119_tree);
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:134:40: STRING
                            {
                            STRING120=(Token)match(input,STRING,FOLLOW_STRING_in_rest_statements1132); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STRING120_tree = 
                            (CommonTree)adaptor.create(STRING120)
                            ;
                            adaptor.addChild(root_0, STRING120_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:136:7: 'what was' IDENT '?'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal121=(Token)match(input,64,FOLLOW_64_in_rest_statements1147); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal121_tree = 
                    (CommonTree)adaptor.create(string_literal121)
                    ;
                    adaptor.addChild(root_0, string_literal121_tree);
                    }

                    IDENT122=(Token)match(input,IDENT,FOLLOW_IDENT_in_rest_statements1149); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT122_tree = 
                    (CommonTree)adaptor.create(IDENT122)
                    ;
                    adaptor.addChild(root_0, IDENT122_tree);
                    }

                    char_literal123=(Token)match(input,27,FOLLOW_27_in_rest_statements1151); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal123_tree = 
                    (CommonTree)adaptor.create(char_literal123)
                    ;
                    adaptor.addChild(root_0, char_literal123_tree);
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
    // $ANTLR end "rest_statements"


    public static class print_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "print"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:138:1: print : ( 'spoke' | 'said Alice' );
    public final malice_grammarParser.print_return print() throws RecognitionException {
        malice_grammarParser.print_return retval = new malice_grammarParser.print_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set124=null;

        CommonTree set124_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:138:6: ( 'spoke' | 'said Alice' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set124=(Token)input.LT(1);

            if ( input.LA(1)==56||input.LA(1)==60 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set124)
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
    // $ANTLR end "print"


    public static class function_call_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_call"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:143:1: function_call : function_name lpar arguments_to_functions rpar ;
    public final malice_grammarParser.function_call_return function_call() throws RecognitionException {
        malice_grammarParser.function_call_return retval = new malice_grammarParser.function_call_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.function_name_return function_name125 =null;

        malice_grammarParser.lpar_return lpar126 =null;

        malice_grammarParser.arguments_to_functions_return arguments_to_functions127 =null;

        malice_grammarParser.rpar_return rpar128 =null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:143:15: ( function_name lpar arguments_to_functions rpar )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:143:18: function_name lpar arguments_to_functions rpar
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_function_name_in_function_call1182);
            function_name125=function_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name125.getTree());

            pushFollow(FOLLOW_lpar_in_function_call1184);
            lpar126=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar126.getTree());

            pushFollow(FOLLOW_arguments_to_functions_in_function_call1186);
            arguments_to_functions127=arguments_to_functions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments_to_functions127.getTree());

            pushFollow(FOLLOW_rpar_in_function_call1188);
            rpar128=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar128.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:144:1: statement : ( rest_statements | declaration_statements );
    public final malice_grammarParser.statement_return statement() throws RecognitionException {
        malice_grammarParser.statement_return retval = new malice_grammarParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        malice_grammarParser.rest_statements_return rest_statements129 =null;

        malice_grammarParser.declaration_statements_return declaration_statements130 =null;



        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:144:11: ( rest_statements | declaration_statements )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0 >= LETTER && LA29_0 <= STRING)||LA29_0==14||LA29_0==19||LA29_0==28||LA29_0==64||LA29_0==67) ) {
                alt29=1;
            }
            else if ( (LA29_0==IDENT) ) {
                int LA29_2 = input.LA(2);

                if ( (LA29_2==11||(LA29_2 >= 13 && LA29_2 <= 14)||(LA29_2 >= 16 && LA29_2 <= 17)||LA29_2==19||LA29_2==21||(LA29_2 >= 30 && LA29_2 <= 31)||(LA29_2 >= 33 && LA29_2 <= 34)||LA29_2==40||LA29_2==56||LA29_2==60||LA29_2==65) ) {
                    alt29=1;
                }
                else if ( (LA29_2==45||LA29_2==63) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:144:13: rest_statements
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_rest_statements_in_statement1196);
                    rest_statements129=rest_statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rest_statements129.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:144:31: declaration_statements
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_statements_in_statement1200);
                    declaration_statements130=declaration_statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements130.getTree());

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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:146:1: statement_conjunctions : ( ',' | 'and' | 'then' | 'but' );
    public final malice_grammarParser.statement_conjunctions_return statement_conjunctions() throws RecognitionException {
        malice_grammarParser.statement_conjunctions_return retval = new malice_grammarParser.statement_conjunctions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set131=null;

        CommonTree set131_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:146:24: ( ',' | 'and' | 'then' | 'but' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set131=(Token)input.LT(1);

            if ( input.LA(1)==18||input.LA(1)==32||input.LA(1)==37||input.LA(1)==61 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set131)
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:155:1: statementList : ( control_structure | nested_function | function | statement ( statement_conjunctions statement )* '.' )* ;
    public final malice_grammarParser.statementList_return statementList() throws RecognitionException {
        malice_grammarParser.statementList_return retval = new malice_grammarParser.statementList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal138=null;
        malice_grammarParser.control_structure_return control_structure132 =null;

        malice_grammarParser.nested_function_return nested_function133 =null;

        malice_grammarParser.function_return function134 =null;

        malice_grammarParser.statement_return statement135 =null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions136 =null;

        malice_grammarParser.statement_return statement137 =null;


        CommonTree char_literal138_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:155:15: ( ( control_structure | nested_function | function | statement ( statement_conjunctions statement )* '.' )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:155:17: ( control_structure | nested_function | function | statement ( statement_conjunctions statement )* '.' )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:155:17: ( control_structure | nested_function | function | statement ( statement_conjunctions statement )* '.' )*
            loop31:
            do {
                int alt31=5;
                switch ( input.LA(1) ) {
                case 41:
                case 43:
                case 53:
                    {
                    alt31=1;
                    }
                    break;
                case 50:
                    {
                    alt31=2;
                    }
                    break;
                case 29:
                    {
                    alt31=3;
                    }
                    break;
                case IDENT:
                case LETTER:
                case NUMBER:
                case STRING:
                case 14:
                case 19:
                case 28:
                case 64:
                case 67:
                    {
                    alt31=4;
                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:155:18: control_structure
            	    {
            	    pushFollow(FOLLOW_control_structure_in_statementList1240);
            	    control_structure132=control_structure();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_structure132.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:155:38: nested_function
            	    {
            	    pushFollow(FOLLOW_nested_function_in_statementList1244);
            	    nested_function133=nested_function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, nested_function133.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:155:56: function
            	    {
            	    pushFollow(FOLLOW_function_in_statementList1248);
            	    function134=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function134.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:155:66: statement ( statement_conjunctions statement )* '.'
            	    {
            	    pushFollow(FOLLOW_statement_in_statementList1251);
            	    statement135=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement135.getTree());

            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:155:76: ( statement_conjunctions statement )*
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==18||LA30_0==32||LA30_0==37||LA30_0==61) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:155:77: statement_conjunctions statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_conjunctions_in_statementList1254);
            	    	    statement_conjunctions136=statement_conjunctions();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions136.getTree());

            	    	    pushFollow(FOLLOW_statement_in_statementList1256);
            	    	    statement137=statement();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement137.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop30;
            	        }
            	    } while (true);


            	    char_literal138=(Token)match(input,20,FOLLOW_20_in_statementList1260); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal138_tree = 
            	    (CommonTree)adaptor.create(char_literal138)
            	    ;
            	    adaptor.addChild(root_0, char_literal138_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:157:1: parameter : ( 'spider' )? data_types IDENT ;
    public final malice_grammarParser.parameter_return parameter() throws RecognitionException {
        malice_grammarParser.parameter_return retval = new malice_grammarParser.parameter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal139=null;
        Token IDENT141=null;
        malice_grammarParser.data_types_return data_types140 =null;


        CommonTree string_literal139_tree=null;
        CommonTree IDENT141_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:157:11: ( ( 'spider' )? data_types IDENT )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:157:13: ( 'spider' )? data_types IDENT
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:157:13: ( 'spider' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==59) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:157:14: 'spider'
                    {
                    string_literal139=(Token)match(input,59,FOLLOW_59_in_parameter1271); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal139_tree = 
                    (CommonTree)adaptor.create(string_literal139)
                    ;
                    adaptor.addChild(root_0, string_literal139_tree);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_data_types_in_parameter1275);
            data_types140=data_types();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types140.getTree());

            IDENT141=(Token)match(input,IDENT,FOLLOW_IDENT_in_parameter1277); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT141_tree = 
            (CommonTree)adaptor.create(IDENT141)
            ;
            adaptor.addChild(root_0, IDENT141_tree);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:1: parameters : ( parameter ( ',' parameter )* )? ;
    public final malice_grammarParser.parameters_return parameters() throws RecognitionException {
        malice_grammarParser.parameters_return retval = new malice_grammarParser.parameters_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal143=null;
        malice_grammarParser.parameter_return parameter142 =null;

        malice_grammarParser.parameter_return parameter144 =null;


        CommonTree char_literal143_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:12: ( ( parameter ( ',' parameter )* )? )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:14: ( parameter ( ',' parameter )* )?
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:14: ( parameter ( ',' parameter )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==46||LA34_0==48||LA34_0==57||LA34_0==59) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:15: parameter ( ',' parameter )*
                    {
                    pushFollow(FOLLOW_parameter_in_parameters1288);
                    parameter142=parameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter142.getTree());

                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:25: ( ',' parameter )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==18) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:160:27: ',' parameter
                    	    {
                    	    char_literal143=(Token)match(input,18,FOLLOW_18_in_parameters1292); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal143_tree = 
                    	    (CommonTree)adaptor.create(char_literal143)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal143_tree);
                    	    }

                    	    pushFollow(FOLLOW_parameter_in_parameters1294);
                    	    parameter144=parameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter144.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:161:1: function_name : IDENT ;
    public final malice_grammarParser.function_name_return function_name() throws RecognitionException {
        malice_grammarParser.function_name_return retval = new malice_grammarParser.function_name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT145=null;

        CommonTree IDENT145_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:161:15: ( IDENT )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:161:17: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT145=(Token)match(input,IDENT,FOLLOW_IDENT_in_function_name1306); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT145_tree = 
            (CommonTree)adaptor.create(IDENT145)
            ;
            adaptor.addChild(root_0, IDENT145_tree);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:163:1: nested_function : 'opened' statementList 'closed' ;
    public final malice_grammarParser.nested_function_return nested_function() throws RecognitionException {
        malice_grammarParser.nested_function_return retval = new malice_grammarParser.nested_function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal146=null;
        Token string_literal148=null;
        malice_grammarParser.statementList_return statementList147 =null;


        CommonTree string_literal146_tree=null;
        CommonTree string_literal148_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:163:17: ( 'opened' statementList 'closed' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:163:19: 'opened' statementList 'closed'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal146=(Token)match(input,50,FOLLOW_50_in_nested_function1314); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal146_tree = 
            (CommonTree)adaptor.create(string_literal146)
            ;
            adaptor.addChild(root_0, string_literal146_tree);
            }

            pushFollow(FOLLOW_statementList_in_nested_function1316);
            statementList147=statementList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList147.getTree());

            string_literal148=(Token)match(input,38,FOLLOW_38_in_nested_function1318); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal148_tree = 
            (CommonTree)adaptor.create(string_literal148)
            ;
            adaptor.addChild(root_0, string_literal148_tree);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:164:1: function : 'The' ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained a' data_types ) 'opened' statementList 'closed' ;
    public final malice_grammarParser.function_return function() throws RecognitionException {
        malice_grammarParser.function_return retval = new malice_grammarParser.function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal149=null;
        Token string_literal150=null;
        Token string_literal155=null;
        Token string_literal160=null;
        Token string_literal162=null;
        Token string_literal164=null;
        malice_grammarParser.function_name_return function_name151 =null;

        malice_grammarParser.lpar_return lpar152 =null;

        malice_grammarParser.parameters_return parameters153 =null;

        malice_grammarParser.rpar_return rpar154 =null;

        malice_grammarParser.function_name_return function_name156 =null;

        malice_grammarParser.lpar_return lpar157 =null;

        malice_grammarParser.parameters_return parameters158 =null;

        malice_grammarParser.rpar_return rpar159 =null;

        malice_grammarParser.data_types_return data_types161 =null;

        malice_grammarParser.statementList_return statementList163 =null;


        CommonTree string_literal149_tree=null;
        CommonTree string_literal150_tree=null;
        CommonTree string_literal155_tree=null;
        CommonTree string_literal160_tree=null;
        CommonTree string_literal162_tree=null;
        CommonTree string_literal164_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:164:9: ( 'The' ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained a' data_types ) 'opened' statementList 'closed' )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:164:11: 'The' ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained a' data_types ) 'opened' statementList 'closed'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal149=(Token)match(input,29,FOLLOW_29_in_function1325); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal149_tree = 
            (CommonTree)adaptor.create(string_literal149)
            ;
            adaptor.addChild(root_0, string_literal149_tree);
            }

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:164:17: ( 'looking-glass' function_name lpar parameters rpar | 'room' function_name lpar parameters rpar 'contained a' data_types )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==47) ) {
                alt35=1;
            }
            else if ( (LA35_0==55) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:164:21: 'looking-glass' function_name lpar parameters rpar
                    {
                    string_literal150=(Token)match(input,47,FOLLOW_47_in_function1331); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal150_tree = 
                    (CommonTree)adaptor.create(string_literal150)
                    ;
                    adaptor.addChild(root_0, string_literal150_tree);
                    }

                    pushFollow(FOLLOW_function_name_in_function1333);
                    function_name151=function_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name151.getTree());

                    pushFollow(FOLLOW_lpar_in_function1335);
                    lpar152=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar152.getTree());

                    pushFollow(FOLLOW_parameters_in_function1337);
                    parameters153=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters153.getTree());

                    pushFollow(FOLLOW_rpar_in_function1339);
                    rpar154=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar154.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:165:17: 'room' function_name lpar parameters rpar 'contained a' data_types
                    {
                    string_literal155=(Token)match(input,55,FOLLOW_55_in_function1357); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal155_tree = 
                    (CommonTree)adaptor.create(string_literal155)
                    ;
                    adaptor.addChild(root_0, string_literal155_tree);
                    }

                    pushFollow(FOLLOW_function_name_in_function1359);
                    function_name156=function_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name156.getTree());

                    pushFollow(FOLLOW_lpar_in_function1361);
                    lpar157=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar157.getTree());

                    pushFollow(FOLLOW_parameters_in_function1363);
                    parameters158=parameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters158.getTree());

                    pushFollow(FOLLOW_rpar_in_function1365);
                    rpar159=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar159.getTree());

                    string_literal160=(Token)match(input,39,FOLLOW_39_in_function1367); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal160_tree = 
                    (CommonTree)adaptor.create(string_literal160)
                    ;
                    adaptor.addChild(root_0, string_literal160_tree);
                    }

                    pushFollow(FOLLOW_data_types_in_function1369);
                    data_types161=data_types();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_types161.getTree());

                    }
                    break;

            }


            string_literal162=(Token)match(input,50,FOLLOW_50_in_function1390); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal162_tree = 
            (CommonTree)adaptor.create(string_literal162)
            ;
            adaptor.addChild(root_0, string_literal162_tree);
            }

            pushFollow(FOLLOW_statementList_in_function1397);
            statementList163=statementList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList163.getTree());

            string_literal164=(Token)match(input,38,FOLLOW_38_in_function1404); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal164_tree = 
            (CommonTree)adaptor.create(string_literal164)
            ;
            adaptor.addChild(root_0, string_literal164_tree);
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
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:171:1: global_declaration : ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )* ;
    public final malice_grammarParser.global_declaration_return global_declaration() throws RecognitionException {
        malice_grammarParser.global_declaration_return retval = new malice_grammarParser.global_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal168=null;
        malice_grammarParser.declaration_statements_return declaration_statements165 =null;

        malice_grammarParser.statement_conjunctions_return statement_conjunctions166 =null;

        malice_grammarParser.declaration_statements_return declaration_statements167 =null;


        CommonTree char_literal168_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:171:20: ( ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )* )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:171:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:171:22: ( declaration_statements ( statement_conjunctions declaration_statements )* '.' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==IDENT) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:171:23: declaration_statements ( statement_conjunctions declaration_statements )* '.'
            	    {
            	    pushFollow(FOLLOW_declaration_statements_in_global_declaration1418);
            	    declaration_statements165=declaration_statements();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements165.getTree());

            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:171:46: ( statement_conjunctions declaration_statements )*
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( (LA36_0==18||LA36_0==32||LA36_0==37||LA36_0==61) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:171:47: statement_conjunctions declaration_statements
            	    	    {
            	    	    pushFollow(FOLLOW_statement_conjunctions_in_global_declaration1421);
            	    	    statement_conjunctions166=statement_conjunctions();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_conjunctions166.getTree());

            	    	    pushFollow(FOLLOW_declaration_statements_in_global_declaration1423);
            	    	    declaration_statements167=declaration_statements();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statements167.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop36;
            	        }
            	    } while (true);


            	    char_literal168=(Token)match(input,20,FOLLOW_20_in_global_declaration1427); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal168_tree = 
            	    (CommonTree)adaptor.create(char_literal168)
            	    ;
            	    adaptor.addChild(root_0, char_literal168_tree);
            	    }

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
    // $ANTLR end "global_declaration"


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:172:1: program : global_declaration ( function )+ EOF ;
    public final malice_grammarParser.program_return program() throws RecognitionException {
        malice_grammarParser.program_return retval = new malice_grammarParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF171=null;
        malice_grammarParser.global_declaration_return global_declaration169 =null;

        malice_grammarParser.function_return function170 =null;


        CommonTree EOF171_tree=null;

        try {
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:172:9: ( global_declaration ( function )+ EOF )
            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:172:11: global_declaration ( function )+ EOF
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_global_declaration_in_program1438);
            global_declaration169=global_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, global_declaration169.getTree());

            // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:172:30: ( function )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==29) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:172:30: function
            	    {
            	    pushFollow(FOLLOW_function_in_program1440);
            	    function170=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function170.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


            EOF171=(Token)match(input,EOF,FOLLOW_EOF_in_program1443); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF171_tree = 
            (CommonTree)adaptor.create(EOF171)
            ;
            adaptor.addChild(root_0, EOF171_tree);
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

    // $ANTLR start synpred1_malice_grammar
    public final void synpred1_malice_grammar_fragment() throws RecognitionException {
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:123:21: ( expr print )
        // C:\\Users\\varun\\Documents\\Malice\\malice\\Compiler\\MAlice\\src\\malice_grammar\\malice_grammar.g:123:22: expr print
        {
        pushFollow(FOLLOW_expr_in_synpred1_malice_grammar929);
        expr();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_print_in_synpred1_malice_grammar931);
        print();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_malice_grammar

    // Delegated rules

    public final boolean synpred1_malice_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_malice_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_STRING_in_rule58 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_14_in_lpar182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rpar189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_mono_op197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_array_elem267 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_array_elem269 = new BitSet(new long[]{0x0000000000084050L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_array_elem271 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_array_elem273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_atom279 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_atom282 = new BitSet(new long[]{0x0000000000084050L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_atom284 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_atom286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_atom292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_atom296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_term368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_term372 = new BitSet(new long[]{0x0000000000084050L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_term374 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_term376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_unary_op393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_op_in_mult400 = new BitSet(new long[]{0x0000000000210802L});
    public static final BitSet FOLLOW_set_in_mult403 = new BitSet(new long[]{0x0000000000084050L,0x0000000000000008L});
    public static final BitSet FOLLOW_unary_op_in_mult415 = new BitSet(new long[]{0x0000000000210802L});
    public static final BitSet FOLLOW_mult_in_add425 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_set_in_add428 = new BitSet(new long[]{0x0000000000084050L,0x0000000000000008L});
    public static final BitSet FOLLOW_mult_in_add436 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_add_in_bitw_and446 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_bitw_and449 = new BitSet(new long[]{0x0000000000084050L,0x0000000000000008L});
    public static final BitSet FOLLOW_add_in_bitw_and451 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_bitw_and_in_bitw_xor461 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_bitw_xor464 = new BitSet(new long[]{0x0000000000084050L,0x0000000000000008L});
    public static final BitSet FOLLOW_bitw_and_in_bitw_xor466 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_bitw_xor_in_bitw_or476 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_bitw_or479 = new BitSet(new long[]{0x0000000000084050L,0x0000000000000008L});
    public static final BitSet FOLLOW_bitw_xor_in_bitw_or481 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_bitw_or_in_expr492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_bool_neg500 = new BitSet(new long[]{0x0000000000004250L});
    public static final BitSet FOLLOW_term_in_bool_neg503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_neg_in_bool_comp511 = new BitSet(new long[]{0x0000000006C00002L});
    public static final BitSet FOLLOW_set_in_bool_comp514 = new BitSet(new long[]{0x0000000000004250L});
    public static final BitSet FOLLOW_bool_neg_in_bool_comp530 = new BitSet(new long[]{0x0000000006C00002L});
    public static final BitSet FOLLOW_bool_comp_in_bool_eq540 = new BitSet(new long[]{0x0000000000001002L,0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_bool_eq543 = new BitSet(new long[]{0x0000000000004250L});
    public static final BitSet FOLLOW_bool_comp_in_bool_eq551 = new BitSet(new long[]{0x0000000000001002L,0x0000000000000004L});
    public static final BitSet FOLLOW_bool_eq_in_bool_expr562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_control_structure588 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_control_structure590 = new BitSet(new long[]{0x0000000000004250L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure592 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_control_structure594 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_control_structure596 = new BitSet(new long[]{0x003C0A00300840F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure604 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_51_in_control_structure613 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_control_structure615 = new BitSet(new long[]{0x0000000000004250L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure617 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_control_structure619 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_control_structure621 = new BitSet(new long[]{0x003C0A00300840F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure623 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_52_in_control_structure632 = new BitSet(new long[]{0x00240A08300840F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure634 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_control_structure641 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_41_in_control_structure650 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_control_structure652 = new BitSet(new long[]{0x0000000000004250L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure654 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_control_structure656 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_control_structure658 = new BitSet(new long[]{0x00340A00300840F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure666 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_control_structure675 = new BitSet(new long[]{0x00240A08300840F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure677 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_control_structure685 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_43_in_control_structure700 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_control_structure702 = new BitSet(new long[]{0x0000000000004250L});
    public static final BitSet FOLLOW_bool_expr_in_control_structure704 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_control_structure706 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_control_structure708 = new BitSet(new long[]{0x00240E00300840F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_control_structure716 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_control_structure724 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_control_structure732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declaration_statements747 = new BitSet(new long[]{0x8000200000000000L});
    public static final BitSet FOLLOW_63_in_declaration_statements751 = new BitSet(new long[]{0x0201400000000000L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements753 = new BitSet(new long[]{0x4002000000000002L});
    public static final BitSet FOLLOW_62_in_declaration_statements757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_declaration_statements761 = new BitSet(new long[]{0x00000000000840F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_LETTER_in_declaration_statements764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_declaration_statements768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_declaration_statements772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_declaration_statements812 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_atom_in_declaration_statements814 = new BitSet(new long[]{0x0201400000000000L});
    public static final BitSet FOLLOW_data_types_in_declaration_statements816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_argument882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_argument886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_argument890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_argument894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_elem_in_argument898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions906 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_arguments_to_functions909 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_argument_in_arguments_to_functions911 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_function_call_in_arguments_to_functions919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_rest_statements938 = new BitSet(new long[]{0x1100000000000000L});
    public static final BitSet FOLLOW_print_in_rest_statements940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rest_statements957 = new BitSet(new long[]{0x1100000000000000L});
    public static final BitSet FOLLOW_print_in_rest_statements965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_rest_statements974 = new BitSet(new long[]{0x0000010640000000L});
    public static final BitSet FOLLOW_30_in_rest_statements987 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_atom_in_rest_statements989 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rest_statements991 = new BitSet(new long[]{0x0000010600000000L});
    public static final BitSet FOLLOW_34_in_rest_statements1012 = new BitSet(new long[]{0x00000000000840F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_rest_statements1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rest_statements1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rest_statements1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rest_statements1119 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_rest_statements1121 = new BitSet(new long[]{0x00000000000840F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_rest_statements1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_rest_statements1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_rest_statements1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rest_statements1147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_rest_statements1149 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rest_statements1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_name_in_function_call1182 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_function_call1184 = new BitSet(new long[]{0x00000000000080F0L});
    public static final BitSet FOLLOW_arguments_to_functions_in_function_call1186 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_function_call1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rest_statements_in_statement1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_statement1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_structure_in_statementList1240 = new BitSet(new long[]{0x00240A00300840F2L,0x0000000000000009L});
    public static final BitSet FOLLOW_nested_function_in_statementList1244 = new BitSet(new long[]{0x00240A00300840F2L,0x0000000000000009L});
    public static final BitSet FOLLOW_function_in_statementList1248 = new BitSet(new long[]{0x00240A00300840F2L,0x0000000000000009L});
    public static final BitSet FOLLOW_statement_in_statementList1251 = new BitSet(new long[]{0x2000002100140000L});
    public static final BitSet FOLLOW_statement_conjunctions_in_statementList1254 = new BitSet(new long[]{0x00000000100840F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statement_in_statementList1256 = new BitSet(new long[]{0x2000002100140000L});
    public static final BitSet FOLLOW_20_in_statementList1260 = new BitSet(new long[]{0x00240A00300840F2L,0x0000000000000009L});
    public static final BitSet FOLLOW_59_in_parameter1271 = new BitSet(new long[]{0x0201400000000000L});
    public static final BitSet FOLLOW_data_types_in_parameter1275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_parameter1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameters1288 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_parameters1292 = new BitSet(new long[]{0x0A01400000000000L});
    public static final BitSet FOLLOW_parameter_in_parameters1294 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_IDENT_in_function_name1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_nested_function1314 = new BitSet(new long[]{0x00240A40300840F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_nested_function1316 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_nested_function1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_function1325 = new BitSet(new long[]{0x0080800000000000L});
    public static final BitSet FOLLOW_47_in_function1331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_function_name_in_function1333 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_function1335 = new BitSet(new long[]{0x0A01400000008000L});
    public static final BitSet FOLLOW_parameters_in_function1337 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_function1339 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_55_in_function1357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_function_name_in_function1359 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_lpar_in_function1361 = new BitSet(new long[]{0x0A01400000008000L});
    public static final BitSet FOLLOW_parameters_in_function1363 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rpar_in_function1365 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_function1367 = new BitSet(new long[]{0x0201400000000000L});
    public static final BitSet FOLLOW_data_types_in_function1369 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_function1390 = new BitSet(new long[]{0x00240A40300840F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_statementList_in_function1397 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_function1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration1418 = new BitSet(new long[]{0x2000002100140000L});
    public static final BitSet FOLLOW_statement_conjunctions_in_global_declaration1421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declaration_statements_in_global_declaration1423 = new BitSet(new long[]{0x2000002100140000L});
    public static final BitSet FOLLOW_20_in_global_declaration1427 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_global_declaration_in_program1438 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_function_in_program1440 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_EOF_in_program1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred1_malice_grammar929 = new BitSet(new long[]{0x1100000000000000L});
    public static final BitSet FOLLOW_print_in_synpred1_malice_grammar931 = new BitSet(new long[]{0x0000000000000002L});

}