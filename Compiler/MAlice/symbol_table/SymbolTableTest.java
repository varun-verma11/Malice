package symbol_table;
import static org.junit.Assert.*;

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
		currTable.insert("x", new VariableSTValue(DATA_TYPES.NUMBER, true));
		currTable.finalizeCurrentScopeLevelTable();
		
		assertEquals(true, currTable.checkItemWasDeclaredBefore("x"));
		assertEquals(false, currTable.checkVariableIsInCurrentScopeLevel("x"));
		assertEquals(true, currTable.checkVariableIsInOtherScopeLevels("x"));
		
	}

}
