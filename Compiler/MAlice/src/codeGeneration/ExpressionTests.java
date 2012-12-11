package codeGeneration;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

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
import symbol_table.FunctionSTValue;
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
		assertTrue(generateCodeForExpression("3>2==1+2<3+2"));
	}
	
	@Test
	public void testForFunction() throws RecognitionException
	{
		assertTrue(generateCodeForExpression("function(x)"));
		assertTrue(generateCodeForExpression("function(x)+2"));
		assertTrue(generateCodeForExpression("function(x)+(x-3+y*function(y))"));
	}
	private boolean generateCodeForExpression(String expr)
			throws RecognitionException
	{
		new ExpressionChecker();
		SymbolTable table = new SymbolTable();
		VariableSTValue value = new VariableSTValue(DATA_TYPES.ARRAY_NUMBER, true);
		table.insert("x", value);
		value.setLocationReg("%x");
		VariableSTValue valueY = new VariableSTValue(DATA_TYPES.ARRAY_NUMBER, true);
		valueY.setLocationReg("%y");
		table.insert("y", valueY);
		ArrayList<DATA_TYPES> args = new ArrayList<DATA_TYPES>();
		args.add(DATA_TYPES.NUMBER);
		args.add(DATA_TYPES.NUMBER);
		FunctionSTValue fVal = new FunctionSTValue(DATA_TYPES.NUMBER, table, args);
		fVal.setLocationReg("@_function");
		table.insert("function", fVal);
		CharStream input = new ANTLRStringStream(expr); 
		malice_grammarLexer lexer = new malice_grammarLexer(input );
		TokenStream tokens = new CommonTokenStream(lexer);
		malice_grammarParser parser = new malice_grammarParser(tokens ) ;
		if (!parser.failed()) {
			Tree tree =  (Tree) parser.expr().getTree() ;
			System.out.println(tree.toStringTree());
			String reg = Expression.getResultReg(tree, table,new LabelGenerator());
			CodeGenerator.printInstructions();
			CodeGenerator.emptyInstructions();
			System.out.println("OUTPUT REG => " + reg);
			return true;
		}
		return false;
	}
}
