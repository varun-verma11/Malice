package symbol_table;

import static org.junit.Assert.assertEquals;
import malice_grammar.malice_grammarLexer;
import malice_grammar.malice_grammarParser;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.junit.Test;


public class ExpressionCheckTests
{
	SymbolTable symbolTable = new SymbolTable();
	@Test
	public void testSimpleExprs() throws RecognitionException
	{
		symbolTable.insert("v", new VariableSTValue(DATA_TYPES.LETTER, true));
		String[] expressions = {"1", "a", "v", "abs(c)"};
		DATA_TYPES[] expected = {DATA_TYPES.NUMBER, DATA_TYPES.ERROR, 
				DATA_TYPES.LETTER, DATA_TYPES.ERROR };
		carry_out_tests(expressions, expected);

	}

	@Test
	public void testExprWithFucntionCalls( ) throws RecognitionException
	{
		DATA_TYPES[][] args_types = {
				{DATA_TYPES.NUMBER, DATA_TYPES.NUMBER},
				{DATA_TYPES.NUMBER, DATA_TYPES.NUMBER} ,
				{DATA_TYPES.NUMBER, DATA_TYPES.NUMBER},
		};
		String[] exprs = {"abs(1,1)" , "ltr(3,2)" , "str(c,1)"};
		
		symbolTable.insert("abs", new FunctionSTValue(DATA_TYPES.NUMBER, 
				symbolTable, args_types[0]));
		assertEquals(DATA_TYPES.NUMBER, getExprType(exprs[0]));
		
		symbolTable.insert("ltr", new FunctionSTValue(DATA_TYPES.NUMBER, 
				symbolTable, args_types[1]));
		assertEquals(DATA_TYPES.NUMBER, getExprType(exprs[1]));
		
		symbolTable.insert("str", new FunctionSTValue(DATA_TYPES.NUMBER, 
				symbolTable, args_types[2]));
		assertEquals(DATA_TYPES.NUMBER, getExprType(exprs[2]));
		//carry_out_tests(exprs, expected);

	}

	private void carry_out_tests(String[] expressions, DATA_TYPES[] expected)
	throws RecognitionException
	{
		int i=0;
		for (String e : expressions)
		{
			assertEquals(expected[i], getExprType(e));
			i++;
		}
	}

	public DATA_TYPES getExprType(String expr) throws RecognitionException
	{
		CharStream input = new ANTLRStringStream(expr); 
		malice_grammarLexer lexer = new malice_grammarLexer(input );
		TokenStream tokens = new CommonTokenStream(lexer);
		malice_grammarParser parser = new malice_grammarParser(tokens ) ;
		malice_grammarParser.expr_return prog =  parser.expr() ;
		return new ExpressionChecker().getExpressionType(prog.tree, symbolTable);
	}
}
