package codeGeneration;

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

public class FunctionTests
{
	@Test
	public void testProcedureWithNoStatements() throws RecognitionException
	{
		SymbolTable table = new SymbolTable();
		ArrayList<DATA_TYPES> args = new ArrayList<DATA_TYPES>();
		args.add(DATA_TYPES.NUMBER);
		args.add(DATA_TYPES.NUMBER);
		FunctionSTValue fVal = new FunctionSTValue(DATA_TYPES.NUMBER, table,
				args);
		
		table.insert("function", fVal);
		table.insert("hatta", fVal);
		
		String proc = "The looking-glass function() opened . closed";
		generateCodeForFunctions(proc, table);
		proc = "The looking-glass function(number x, number y) opened . closed";
		generateCodeForFunctions(proc, table);
		proc = "The looking-glass function(letter x, sentence y) opened . closed";
		generateCodeForFunctions(proc, table);
		proc = "The looking-glass hatta(letter x, sentence y) opened . closed";
		generateCodeForFunctions(proc, table);
	}
	
	@Test
	public void testFunctionWithNoStatements() throws RecognitionException
	{
		SymbolTable table = new SymbolTable();
		ArrayList<DATA_TYPES> args = new ArrayList<DATA_TYPES>();
		args.add(DATA_TYPES.NUMBER);
		args.add(DATA_TYPES.NUMBER);
		FunctionSTValue fVal = new FunctionSTValue(DATA_TYPES.NUMBER, table,
				args);
		
		table.insert("function", fVal);
		table.insert("hatta", fVal);
		FunctionSTValue fValLetter = new FunctionSTValue(DATA_TYPES.LETTER, table,
				args);
		table.insert("functionLetter", fValLetter);
		FunctionSTValue fValString = new FunctionSTValue(DATA_TYPES.SENTENCE, table,
				args);
		table.insert("functionSentence", fValString);
		
		String proc = "The room function() contained a number opened . closed";
		generateCodeForFunctions(proc, table);
		proc = "The room functionLetter() contained a letter opened . closed";
		generateCodeForFunctions(proc, table);
		proc = "The room functionSentence() contained a sentence opened . closed";
		generateCodeForFunctions(proc, table);
	}

	private boolean generateCodeForFunctions(String expr, SymbolTable table)
			throws RecognitionException
	{
		new ExpressionChecker();
		CharStream input = new ANTLRStringStream(expr);
		malice_grammarLexer lexer = new malice_grammarLexer(input);
		TokenStream tokens = new CommonTokenStream(lexer);
		malice_grammarParser parser = new malice_grammarParser(tokens);
		if (!parser.failed())
		{
			Tree tree = (Tree) parser.function().getTree();
			System.out.println(tree.toStringTree());
			Function.writeCodeForFunctions(tree, table);
			CodeGenerator.printInstructions();
			CodeGenerator.emptyInstructions();
			return true;
		}
		return false;
	}
}
