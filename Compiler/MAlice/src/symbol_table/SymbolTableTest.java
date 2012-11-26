package symbol_table;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
		symTab.insert("hiiii", new VariableSTValue( DATA_TYPES.STRING, false));
		
//		assertEquals("hiiii", symTab.lookup("hiiii").getIdentifier());		
		assertEquals(DATA_TYPES.STRING, symTab.lookup("hiiii").getType());		
		assertEquals(DATA_TYPES.LETTER, symTab.lookup("y").getType());		
		assertEquals(DATA_TYPES.NUMBER, symTab.lookup("abc").getType());		
//		assertEquals("x", symTab.lookup("x").getIdentifier());
		assertEquals(DATA_TYPES.STRING, symTab.lookup("hiiii").getType());		
		assertEquals(DATA_TYPES.LETTER, symTab.lookup("y").getType());		
		assertEquals(DATA_TYPES.NUMBER, symTab.lookup("abc").getType());		
		assertEquals(DATA_TYPES.NUMBER, symTab.lookup("x").getType());		
	
		assertEquals(true, symTab.checkVariableIsInCurrentScopeLevel("x"));
		assertEquals(false, symTab.checkVariableIsInCurrentScopeLevel("r"));
	}


	@Test
	public void multipleScopingTest() {
		DATA_TYPES[] args = {DATA_TYPES.NUMBER, DATA_TYPES.LETTER, DATA_TYPES.STRING};
		DATA_TYPES retVal = DATA_TYPES.NUMBER;

		symTab.insert("x", new VariableSTValue( DATA_TYPES.NUMBER, false));
		symTab.insert("y", new VariableSTValue(DATA_TYPES.LETTER, false));
		symTab.insert("abc", new FunctionSTValue( symTab, args));
		symTab.insert("hiiii", new FunctionSTValue(retVal, symTab, args));
	
	}
	
	@Test
	public void simpleProgramTest() {
		SymbolTable currTable;
		DATA_TYPES[] args = {DATA_TYPES.NUMBER};
		FunctionSTValue fn = new FunctionSTValue(symTab, args);
		symTab.insert("hello", fn);
		currTable = fn.getTable();
		System.out.println(currTable.getCurrentScopeLevel());
		currTable.insert("x", new VariableSTValue(DATA_TYPES.NUMBER, true));
		assertEquals(true, currTable.checkVariableIsInCurrentScopeLevel("x"));
		//assertEquals(true, currTable.checkItemWasDeclaredBefore("hello"));

		currTable.finalizeCurrentScopeLevelTable();
		
		assertEquals(false, currTable.checkItemWasDeclaredBefore("x"));
		assertEquals(false, currTable.checkVariableIsInCurrentScopeLevel("x"));
		//assertEquals(false, currTable.checkVariableIsInOtherScopeLevels("x"));
		
	}
	
	@Test
	public void testVarInOtherScopeWorksTest() 
	{
		SymbolTable currTable;
		DATA_TYPES[] argsv = {DATA_TYPES.NUMBER, DATA_TYPES.STRING};
		DATA_TYPES[] argsc, argsh = {DATA_TYPES.NUMBER};

		
		
		FunctionSTValue fn = new FunctionSTValue(symTab,argsv);
		symTab.insert("hello", fn);
		currTable = currFunctTable.getTable();
		System.out.println(currTable.getCurrentScopeLevel());
		currTable.insert("x", new VariableSTValue(DATA_TYPES.NUMBER, true));
	
		assertEquals(true, currTable.checkItemWasDeclaredBefore("x"));
		assertEquals(true, currTable.checkVariableIsInCurrentScopeLevel("x"));
		assertEquals(true, currTable.checkVariableIsInOtherScopeLevels("x", currTable.getCurrentScopeLevel()));

		FunctionSTValue fnn = new FunctionSTValue(currTable, args);
		currTable.insert("hi", fnn);
		currTable = fnn.getTable();
		
		System.out.println(currTable.getCurrentScopeLevel());
		currTable. insert("sbs", new VariableSTValue(DATA_TYPES.STRING, false));
		currTable.insert("j", new VariableSTValue(DATA_TYPES.NUMBER, false));
		
		assertTrue(currTable.checkItemWasDeclaredBefore("j"));
		assertTrue(currTable.checkItemWasDeclaredBefore("sbs"));
		assertFalse(currTable.checkItemWasDeclaredBefore("g"));
		assertTrue(currTable.checkItemWasDeclaredBefore("hi"));

		
		assertTrue(currTable.checkVariableIsInCurrentScopeLevel("j"));
		assertFalse(currTable.checkVariableIsInCurrentScopeLevel("x"));
	//	assertTrue(currTable.checkVariableIsInOtherScopeLevels("x"));
	//	assertFalse(currTable.checkVariableIsInOtherScopeLevels("htt"));
		
	}
	
	
//	@Test
//	public void harderProgramTest() {
//		
//		/*
//		 * noOfHeads was a number.
//		 * The looking-glass varun(number noOfEars, sentence nickname)
//		 * opened
//		 * noOfHeads became noOfEars / 2.
//		 * The room calculateBrainPower(number tirednessLevel) contained a number
//		 * opened
//		 * 	brainPower was a number of (noOfHeads / tirednessLevel).
//		 * 	Alice found brainPower.
//		 * closed
//		 * The looking-glass annoyingHarshie(number annoyingnessLevel)
//		 * opened
//		 * closed
//		 */
//				
//		
//		SymbolTable currTable;
//		DATA_TYPES[] argsv = {DATA_TYPES.NUMBER, DATA_TYPES.STRING};
//		DATA_TYPES[] argsc, argsh = {DATA_TYPES.NUMBER};
//
//		
//		
//		FunctionSTValue fn = new FunctionSTValue(symTab, args);
//		symTab.insert("hello", fn);
//		currTable = fn.getTable();
//		System.out.println(currTable.getCurrentScopeLevel());
//		currTable.insert("x", new VariableSTValue(DATA_TYPES.NUMBER, true));
//		assertEquals(true, currTable.checkVariableIsInCurrentScopeLevel("x"));
//		currTable.finalizeCurrentScopeLevelTable();
//		
//		assertEquals(false, currTable.checkItemWasDeclaredBefore("x"));
//		assertEquals(false, currTable.checkVariableIsInCurrentScopeLevel("x"));
//		assertEquals(false, currTable.checkVariableIsInOtherScopeLevels("x"));
//		
//	}
//	
	

}
