package malice_grammar;

import java.io.IOException;

import malice_grammar.malice_grammarParser.program_return;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

import semantics_checks.ExpressionChecker;
import symbol_table.SymbolTable;

public class Malice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Please provide with filename.");
			return;
		}
		if (!args[0].endsWith(".alice")) {
			System.err.println("Invalid File (" + args[0]
					+ "): Wrong extension.");
			return;
		}
		try {
			new ExpressionChecker();
			String filepath = args[0]; 
			SymbolTable table = new SymbolTable();
			System.out.println(filepath + " start");
			CharStream input = new ANTLRFileStream(filepath);
			malice_grammarLexer lexer = new malice_grammarLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			if (lexer.getNumberOfSyntaxErrors() == 0) {
				malice_grammarParser parser = new malice_grammarParser(tokens);
				program_return prog = parser.program();
				if (parser.getNumberOfSyntaxErrors() == 0) {
					Tree tree = (Tree) prog.getTree();
					System.out.println(tree.toStringTree());
					SemanticVerifier.checkProgramSemantics(tree, table);
				}
			}
			System.out.println(filepath + " done");
		} catch (IOException e) {
			System.out.println("The filepath is incorrect."
					+ " Please use a valid filepath");
		} catch (RecognitionException e) {
			e.printStackTrace();
		}

	}

}
