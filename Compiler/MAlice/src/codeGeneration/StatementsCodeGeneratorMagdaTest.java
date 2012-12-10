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

public class StatementsCodeGeneratorMagdaTest {

	@Test
	public void test() throws RecognitionException {
		String st = "x became 3";
		assertTrue(generateCodeForStatement(st));
	}

	
	

	private boolean generateCodeForStatement(String expr)
			throws RecognitionException {
		new ExpressionChecker();
		SymbolTable table = new SymbolTable();
		table.insert("x", new VariableSTValue(DATA_TYPES.LETTER, true));
		table.insert("y", new VariableSTValue(DATA_TYPES.ARRAY_NUMBER, true));
		CharStream input = new ANTLRStringStream(expr);
		malice_grammarLexer lexer = new malice_grammarLexer(input);
		TokenStream tokens = new CommonTokenStream(lexer);
		malice_grammarParser parser = new malice_grammarParser(tokens);
		if (!parser.failed()) {
			Tree tree = (Tree) parser.statement().getTree();
			System.out.println(tree.toStringTree());
			StatementsCodeGeneratorMagda.writeBecameCode(tree, table, new LabelGenerator());
			CodeGenerator.printInstructions();
			CodeGenerator.emptyInstructions();
			return true;
		}
		return false;
	}

}
