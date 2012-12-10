package codeGeneration;

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

public class ControlStructureTest
{
	// @Test
	// public void testEither() throws RecognitionException
	// {
	// String either = "either (x<0 && x>43) so \n x became x+x-x+4*x. " +
	// "\n or \n x became x+2*(~x)+x. " +
	// "\n because Alice was unsure which";
	// generateCodeForEither(either, TYPE.EITHER);
	// }
	//
	// @Test
	// public void testEventually() throws RecognitionException
	// {
	// String eventually = "eventually (1>6) because " +
	// "\n x became x+x-x+4*x. enough times";
	// generateCodeForEither(eventually, TYPE.EVENTUALLY);
	// eventually = "eventually (x>6) because " +
	// "\n x became x+x-x+4*x. enough times";
	// generateCodeForEither(eventually, TYPE.EVENTUALLY);
	// }

	@Test
	public void testPerhaps() throws RecognitionException
	{
		String perhaps;
//		perhaps = "perhaps (x<2) so \n" + "c spoke. \n"
//				+ "or maybe (x<1) so \n" + "y spoke. \n"
//				+ "or maybe (x<1) so \n" + "y spoke. \n" + "or \n"
//				+ "c spoke. \n" + "because Alice was unsure which. \n";
//		generateCodeForEither(perhaps, TYPE.PERHAPS);
//		perhaps = "perhaps (x<2) so x spoke. because Alice was unsure which.";
//		generateCodeForEither(perhaps, TYPE.PERHAPS);
//		perhaps = "perhaps (x<2) so \n" + "c spoke. \n"
//				+ "or maybe (x<1) so \n" + "y spoke. \n"
//				+ "because Alice was unsure which. \n";
//		generateCodeForEither(perhaps, TYPE.PERHAPS);
		
		perhaps = "perhaps (x<2) so \n" + "c spoke. \n"
			+ "or maybe (0<1) so \n" + "y spoke. \n"
			+ "because Alice was unsure which. \n";
		generateCodeForEither(perhaps, TYPE.PERHAPS);
	}

	private enum TYPE
	{
		EVENTUALLY, EITHER, PERHAPS;
	}

	private boolean generateCodeForEither(String statement, TYPE type)
			throws RecognitionException
	{
		new ExpressionChecker();
		SymbolTable table = new SymbolTable();
		table.insert("x", new VariableSTValue(DATA_TYPES.NUMBER, true));
		table.insert("y", new VariableSTValue(DATA_TYPES.NUMBER, true));
		CharStream input = new ANTLRStringStream(statement);
		malice_grammarLexer lexer = new malice_grammarLexer(input);
		TokenStream tokens = new CommonTokenStream(lexer);
		malice_grammarParser parser = new malice_grammarParser(tokens);
		if (!parser.failed())
		{
			Tree tree = (Tree) parser.control_structure().getTree();
			System.out.println(tree.toStringTree());
			switch (type)
			{
				case EITHER:
					ControlStructure.writeEitherStatement(tree, table,
							new LabelGenerator());
					break;
				case EVENTUALLY:
					ControlStructure.writeEventuallyStatement(tree, table,
							new LabelGenerator());
					break;
				case PERHAPS:
					ControlStructure.writePerhapsStatements(tree, table,
							new LabelGenerator());
					break;
			}

			CodeGenerator.printInstructions();
			CodeGenerator.emptyInstructions();
			return true;
		}
		return false;
	}
}
