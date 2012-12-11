package codeGeneration;

import static org.junit.Assert.*;
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

public class TestsHarsh {

	@Test
	public void test() throws RecognitionException {
		String st = "x was a sentence of \"I am\"";
		assertTrue(generateCodeForStatement(st));
	}

	private boolean generateCodeForStatement(String expr)
			throws RecognitionException {
		SymbolTable table = new SymbolTable();
		CharStream input = new ANTLRStringStream(expr);
		malice_grammarLexer lexer = new malice_grammarLexer(input);
		TokenStream tokens = new CommonTokenStream(lexer);
		malice_grammarParser parser = new malice_grammarParser(tokens);
		if (!parser.failed()) {
			Tree tree = (Tree) parser.declaration_statements().getTree();
			System.out.println(tree.toStringTree());
			StatementsHarsh.getStatement(tree, table);
			CodeGenerator.printInstructions();
			CodeGenerator.emptyInstructions();
			return true;
		}
		return false;
	}

}
