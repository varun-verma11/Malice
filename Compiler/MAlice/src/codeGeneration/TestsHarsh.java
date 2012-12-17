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

import symbol_table.DATA_TYPES;
import symbol_table.FunctionSTValue;
import symbol_table.SymbolTable;
import symbol_table.VariableSTValue;

public class TestsHarsh {

	@Test
	public void test() throws RecognitionException {
//		String st = "what was x?";
//		assertTrue(generateCodeForStatement(st));
//		
//		st = "what was y?";
//		assertTrue(generateCodeForStatement(st));
//		
//		st = "what was z?";
//		assertTrue(generateCodeForStatement(st));

		String st = "bjsdkfksrdv was a sentence of \"abc\"";
		assertTrue(generateCodeForStatement(st));
		st = "x3 was a number of 256";
		assertTrue(generateCodeForStatement(st));
		st = "x4 was a number";
				
//		assertTrue(generateCodeForStatement(st));
//		st = "x5 was a letter";
//		assertTrue(generateCodeForStatement(st));
//		String st = "x6 was a letter of \'a\'";
//		assertTrue(generateCodeForStatement(st));
		
		
		
		
	}

	
	
	private boolean generateCodeForStatement(String expr)
			throws RecognitionException {
		
		SymbolTable table = new SymbolTable();
		
		ArrayList<DATA_TYPES> args = new ArrayList<DATA_TYPES>();
		VariableSTValue x = new VariableSTValue(DATA_TYPES.NUMBER, true);
		VariableSTValue y = new VariableSTValue(DATA_TYPES.LETTER, true);
		VariableSTValue z = new VariableSTValue(DATA_TYPES.SENTENCE, true);

		
		args.add(DATA_TYPES.NUMBER);
		
		FunctionSTValue fn = new FunctionSTValue(table,args);
		VariableSTValue fnX = new VariableSTValue(DATA_TYPES.NUMBER, true);
		VariableSTValue z2 = new VariableSTValue(DATA_TYPES.SENTENCE, true);

		
		x.setLocationReg("@x");
		y.setLocationReg("@y");
		z.setLocationReg("@z");
		fn.setLocationReg("@fn");
		fnX.setLocationReg("%fnX");
		z2.setLocationReg("%z2");
		
		table.insert("x", x);
		table.insert("y", y);
		table.insert("z", z);
		
		table.insert("fn", fn);
		table = fn.getTable();
		table.insert("fnX",fnX);
		table.insert("z2", z2);
		
		CharStream input = new ANTLRStringStream(expr);

		malice_grammarLexer lexer = new malice_grammarLexer(input);
		TokenStream tokens = new CommonTokenStream(lexer);
		malice_grammarParser parser = new malice_grammarParser(tokens);
		if (!parser.failed()) {
			Tree tree = (Tree) parser.read_statement().getTree();
			System.out.println(tree.toStringTree());
			Statement.generateAllStatementCode(tree, table, new LabelGenerator());
			CodeGenerator.printInstructions();
			CodeGenerator.emptyInstructions();
			return true;
		}
		return false;
	}

}
