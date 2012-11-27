package symbol_table;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class SymbolTableTest {

	SymbolTable symTab = new SymbolTable();
	
	
	@Test
	public void isVariableInTableTest() {
		
	}

	@Test
	public void canAddToTableTest() {
		symTab.insert("x", new VariableSTValue(DATA_TYPES.NUMBER, false));
		symTab.insert("y", new VariableSTValue(DATA_TYPES.LETTER, false));
		symTab.insert("abc", new VariableSTValue(DATA_TYPES.NUMBER, false));
		symTab.insert("hiiii", new VariableSTValue( DATA_TYPES.SENTENCE, false));
		
		assertEquals(DATA_TYPES.SENTENCE, symTab.lookup("hiiii").getType());		
		assertEquals(DATA_TYPES.LETTER, symTab.lookup("y").getType());		
		assertEquals(DATA_TYPES.NUMBER, symTab.lookup("abc").getType());		
		assertEquals(DATA_TYPES.NUMBER, symTab.lookup("x").getType());		
	
		assertEquals(true, symTab.checkVariableIsInCurrentScopeLevel("x"));
		assertEquals(false, symTab.checkVariableIsInCurrentScopeLevel("r"));
	}


	@Test
	public void multipleScopingTest() {
		ArrayList<DATA_TYPES> args = new ArrayList<DATA_TYPES>();
		args.add(DATA_TYPES.NUMBER);
		args.add(DATA_TYPES.LETTER);
		args.add(DATA_TYPES.SENTENCE);
		DATA_TYPES retVal = DATA_TYPES.NUMBER;

		symTab.insert("x", new VariableSTValue( DATA_TYPES.NUMBER, false));
		symTab.insert("y", new VariableSTValue(DATA_TYPES.LETTER, false));
		symTab.insert("abc", new FunctionSTValue( symTab, args));
		symTab.insert("hiiii", new FunctionSTValue(retVal, symTab, args));
	
	}
	
	@Test
	public void simpleProgramTest() {
		SymbolTable currTable;
		ArrayList<DATA_TYPES> args = new ArrayList<DATA_TYPES>();
		args.add(DATA_TYPES.NUMBER);
		
		FunctionSTValue fn = new FunctionSTValue(DATA_TYPES.SENTENCE, symTab, args);
		symTab.insert("hello", fn);
		currTable = fn.getTable();
		System.out.println("simpleProgramTest scope level: " + currTable.getCurrentScopeLevel());
		currTable.insert("x", new VariableSTValue(DATA_TYPES.NUMBER, true));
		assertEquals(true, currTable.checkVariableIsInCurrentScopeLevel("x"));
		assertEquals(true, currTable.checkItemWasDeclaredBefore("hello"));

		currTable = currTable.finalizeCurrentScopeLevelTable();
		
		assertEquals(false, currTable.checkItemWasDeclaredBefore("x"));
		assertEquals(false, currTable.checkVariableIsInCurrentScopeLevel("x"));
		assertEquals(false, currTable.checkVariableIsInOtherScopeLevels("x"));
		assertTrue(currTable.checkVariableIsInCurrentScopeLevel("hello"));

	}
	
	@Test
	public void testVarInOtherScopeWorksTest() 
	{
		SymbolTable currTable;
		ArrayList<DATA_TYPES> argsv = new ArrayList<DATA_TYPES>();
		argsv.add(DATA_TYPES.NUMBER);
		argsv.add(DATA_TYPES.SENTENCE);
		
		ArrayList<DATA_TYPES> argsc = new ArrayList<DATA_TYPES>();
		argsc.add(DATA_TYPES.NUMBER);
		
		ArrayList<DATA_TYPES> argsh = new ArrayList<DATA_TYPES>();
		argsh.add(DATA_TYPES.NUMBER);

		
		FunctionSTValue fn = new FunctionSTValue(DATA_TYPES.SENTENCE, symTab, argsv);
		symTab.insert("hello", fn);
		currTable = fn.getTable();
		System.out.println("testVar scope level 1: " + currTable.getCurrentScopeLevel());
		currTable.insert("x", new VariableSTValue(DATA_TYPES.NUMBER, true));
	
		assertEquals(true, currTable.checkItemWasDeclaredBefore("x"));
		assertEquals(true, currTable.checkVariableIsInCurrentScopeLevel("x"));
		assertEquals(true, currTable.checkVariableIsInOtherScopeLevels("x"));

		FunctionSTValue fnn = new FunctionSTValue(currTable, argsc);
		currTable.insert("hi", fnn);
		currTable = fnn.getTable();
		
		System.out.println("testVar scope level 2: " + currTable.getCurrentScopeLevel());
		currTable. insert("sbs", new VariableSTValue(DATA_TYPES.SENTENCE, false));
		currTable.insert("j", new VariableSTValue(DATA_TYPES.NUMBER, false));
		
		assertTrue(currTable.checkItemWasDeclaredBefore("j"));
		assertTrue(currTable.checkItemWasDeclaredBefore("sbs"));
		assertFalse(currTable.checkItemWasDeclaredBefore("g"));
		assertTrue(currTable.checkItemWasDeclaredBefore("hi"));

		
		assertTrue(currTable.checkVariableIsInCurrentScopeLevel("j"));
		assertFalse(currTable.checkVariableIsInCurrentScopeLevel("x"));
		assertTrue(currTable.checkVariableIsInOtherScopeLevels("x"));
		assertFalse(currTable.checkVariableIsInOtherScopeLevels("htt"));
		
		currTable = currTable.finalizeCurrentScopeLevelTable();
		System.out.println("testVar scope level -1: " + currTable.getCurrentScopeLevel());

		currTable = currTable.finalizeCurrentScopeLevelTable();
		System.out.println("testVar scope level -2: " + currTable.getCurrentScopeLevel());
		//currTable = currTable.finalizeCurrentScopeLevelTable();
		//System.out.println("this should never be reached!!!!");
	}
	
	
	@Test
	public void harderProgramTest() {
		
		/*
		 * noOfHeads was a number.
		 * The looking-glass varun(number noOfEars, sentence nickname)
		 * opened
		 * noOfHeads became noOfEars / 2.
		 * The room calculateBrainPower(number tirednessLevel) contained a number
		 * opened
		 * 	brainPower was a number of (noOfHeads / tirednessLevel).
		 * 	Alice found brainPower.
		 * closed
		 * closed
		 * The looking-glass annoyingHarshie(number annoyingnessLevel)
		 * opened
		 * closed
		 */
				
		System.out.println("VARUN PROGRAM TESTS");
		SymbolTable currTable;
		ArrayList<DATA_TYPES> argsv = new ArrayList<DATA_TYPES>();
		argsv.add(DATA_TYPES.NUMBER);
		argsv.add(DATA_TYPES.SENTENCE);
		
		ArrayList<DATA_TYPES> argsc = new ArrayList<DATA_TYPES>();
		argsc.add(DATA_TYPES.NUMBER);
		
		ArrayList<DATA_TYPES> argsh = new ArrayList<DATA_TYPES>();
		argsh.add(DATA_TYPES.NUMBER);

		symTab.insert("noOfHeads", new VariableSTValue(DATA_TYPES.NUMBER, false));
		FunctionSTValue varunNode = new FunctionSTValue(symTab, argsv);
		symTab.insert("varun", varunNode);
		
		assertTrue(symTab.checkItemWasDeclaredBefore("noOfHeads"));
		assertTrue(symTab.checkVariableIsInOtherScopeLevels("noOfHeads"));
		assertTrue(symTab.checkItemWasDeclaredBefore("varun"));
		assertTrue(symTab.checkVariableIsInOtherScopeLevels("varun"));
		
		System.out.println("Varun program: scope level 0: " + symTab.getCurrentScopeLevel());
		
		
		currTable = varunNode.getTable();
		
		System.out.println("Varun program: scope level 1: " + currTable.getCurrentScopeLevel());
		
		currTable.insert("noOfEars", new VariableSTValue(DATA_TYPES.NUMBER, true)); ////how do we get it to stay initialised in all scopes?? make sure thos happens when we link it with harsh's stuff
		currTable.insert("nickname", new VariableSTValue(DATA_TYPES.SENTENCE, true)); // here harsh's code needs to make sure that the functions params are initialised!!!!
		FunctionSTValue calcNode = new FunctionSTValue(DATA_TYPES.NUMBER, currTable, argsc);
		currTable.insert("calculateBrainPower", calcNode);
		
		assertTrue(currTable.checkVariableIsInOtherScopeLevels("noOfHeads"));
		assertTrue(currTable.checkVariableIsInOtherScopeLevels("varun"));
		assertTrue(currTable.checkVariableIsInOtherScopeLevels("noOfEars"));
		assertTrue(currTable.checkVariableIsInOtherScopeLevels("nickname"));
		assertTrue(currTable.checkVariableIsInOtherScopeLevels("calculateBrainPower"));
		assertTrue(currTable.checkVariableIsInOtherScopeLevels("noOfHeads"));

		currTable = calcNode.getTable();
		
		System.out.println("Varun program: scope level 2: " + currTable.getCurrentScopeLevel());
		
		currTable.insert("tirednessLevel", new VariableSTValue(DATA_TYPES.NUMBER, true));
		currTable.insert("brainPower", new VariableSTValue(DATA_TYPES.NUMBER, true));
		
		assertTrue(currTable.checkVariableIsInOtherScopeLevels("tirednessLevel"));
		assertTrue(currTable.checkVariableIsInOtherScopeLevels("brainPower"));
		assertFalse(currTable.checkVariableIsInOtherScopeLevels("Nickname"));
		//assertTrue(currTable.checkVariableIsInOtherScopeLevels("noOfHeads"));
		
		currTable = currTable.finalizeCurrentScopeLevelTable();
		
		System.out.println("Varun program: scope level 1: " + currTable.getCurrentScopeLevel());
		
		assertFalse(currTable.checkVariableIsInOtherScopeLevels("brainPower"));
		assertTrue(currTable.checkItemWasDeclaredBefore("nickname"));
		assertTrue(currTable.checkVariableIsInOtherScopeLevels("calculateBrainPower"));


		currTable = currTable.finalizeCurrentScopeLevelTable();
		
		System.out.println("Varun program: scope level 0: " + currTable.getCurrentScopeLevel());
		
		//assertTrue(currTable.checkVariableIsInOtherScopeLevels("heads"));
		assertFalse(currTable.checkVariableIsInOtherScopeLevels("brainPower"));
		assertFalse(currTable.checkVariableIsInOtherScopeLevels("calculateBrainPower"));
		assertFalse(currTable.checkVariableIsInOtherScopeLevels("annoyingHarshie"));

		
		FunctionSTValue aHNode = new FunctionSTValue(currTable, argsc);
		currTable.insert("annoyingHarshie", aHNode);
		
		
		assertTrue(currTable.checkVariableIsInOtherScopeLevels("annoyingHarshie"));

		
		currTable = aHNode.getTable();
		System.out.println("Varun program: scope level 1: " + currTable.getCurrentScopeLevel());
		currTable.insert("annoyingnessLevel", new VariableSTValue(DATA_TYPES.NUMBER, true));
		
		
		assertTrue(currTable.checkVariableIsInOtherScopeLevels("annoyingHarshie"));
		assertTrue(currTable.checkVariableIsInOtherScopeLevels("annoyingnessLevel"));

		
		currTable = currTable.finalizeCurrentScopeLevelTable();
		System.out.println("Varun program: scope level 0: " + currTable.getCurrentScopeLevel());

	}
	
	

}
