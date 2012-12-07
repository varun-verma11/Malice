package codeGeneration;

import static org.junit.Assert.assertTrue;
import malice_grammar.malice_grammarLexer;
import malice_grammar.malice_grammarParser;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;

import semantics_checks.ExpressionChecker;
import symbol_table.DATA_TYPES;
import symbol_table.SymbolTable;
import symbol_table.VariableSTValue;


public class ExpressionTests
{
//	@Test
//	public void testSimpleExpressions() throws IOException, RecognitionException
//	{
//		assertTrue(generateCodeForExpression("x>2"));
//		assertTrue(generateCodeForExpression("x"));
//		assertTrue(generateCodeForExpression("2"));
//		assertTrue(generateCodeForExpression("x<2"));
//		assertTrue(generateCodeForExpression("x|2"));
//		assertTrue(generateCodeForExpression("x^4"));
//		assertTrue(generateCodeForExpression("x&4"));
//		assertTrue(generateCodeForExpression("x==2"));
//		assertTrue(generateCodeForExpression("x!=2"));
//		assertTrue(generateCodeForExpression("x<=3"));
//		assertTrue(generateCodeForExpression("x>2"));
//		assertTrue(generateCodeForExpression("x>=2"));
//		assertTrue(generateCodeForExpression("x+2"));
//		assertTrue(generateCodeForExpression("x-2"));
//		assertTrue(generateCodeForExpression("x*4"));
//		assertTrue(generateCodeForExpression("x/3"));
//		assertTrue(generateCodeForExpression("x%x"));
//		assertTrue(generateCodeForExpression("~x"));
//		assertTrue(generateCodeForExpression("x && y"));
//		assertTrue(generateCodeForExpression("x || y"));
//		assertTrue(generateCodeForExpression("!x"));
//	}
	
	@Test
	public void testForOptimisation() throws RecognitionException
	{
		assertTrue(generateCodeForExpression("x>2==1+2<x"));
		assertTrue(generateCodeForExpression("x>2==1+2<3+2"));
	}
	private boolean generateCodeForExpression(String expr)
			throws RecognitionException
	{
		new ExpressionChecker();
		SymbolTable table = new SymbolTable();
		table.insert("x", new VariableSTValue(DATA_TYPES.ARRAY_NUMBER, true));
		table.insert("y", new VariableSTValue(DATA_TYPES.ARRAY_NUMBER, true));
		CharStream input = new ANTLRStringStream(expr); 
		malice_grammarLexer lexer = new malice_grammarLexer(input );
		TokenStream tokens = new CommonTokenStream(lexer);
		malice_grammarParser parser = new malice_grammarParser(tokens ) ;
		if (!parser.failed()) {
			Tree tree =  (Tree) parser.expr().getTree() ;
			System.out.println(tree.toStringTree());
			Expression.getResultReg(tree, table);
			CodeGenerator.printInstructions();
			CodeGenerator.emptyInstructions();
			return true;
		}
		return false;
	}
}
