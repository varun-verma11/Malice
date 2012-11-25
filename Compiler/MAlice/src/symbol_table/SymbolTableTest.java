package symbol_table;

<<<<<<< HEAD
import static org.junit.Assert.assertEquals;

import org.junit.Test;


=======
import static org.junit.Assert.*;

import org.junit.Test;

>>>>>>> 23e7b9785d0280e6e60c60cac184c4f932b58c4c
public class SymbolTableTest {

	SymbolTable symTab = new SymbolTable();
	
	
	@Test
	public void isVariableInTableTest() {
		
	}

	@Test
	public void canWeAddToTableTest() {
<<<<<<< HEAD
		symTab.insert("x", new VariableSTValue(DATA_TYPES.NUMBER, false));
		symTab.insert("y", new VariableSTValue(DATA_TYPES.LETTER, false));
		symTab.insert("abc", new VariableSTValue(DATA_TYPES.NUMBER, false));
		symTab.insert("hiiii", new VariableSTValue( DATA_TYPES.STRING, false));
		
//		assertEquals("hiiii", symTab.lookup("hiiii").getIdentifier());		
		assertEquals(DATA_TYPES.STRING, symTab.lookup("hiiii").getType());		
//		assertEquals("y", symTab.lookup("y").getIdentifier());		
		assertEquals(DATA_TYPES.LETTER, symTab.lookup("y").getType());		
//		assertEquals("abc", symTab.lookup("abc").getIdentifier());
		assertEquals(DATA_TYPES.NUMBER, symTab.lookup("abc").getType());		
//		assertEquals("x", symTab.lookup("x").getIdentifier());
=======
		symTab.insert("x", new VariableSTValue("x", DATA_TYPES.NUMBER, false));
		symTab.insert("y", new VariableSTValue("y", DATA_TYPES.LETTER, false));
		symTab.insert("abc", new VariableSTValue("abc", DATA_TYPES.NUMBER, false));
		symTab.insert("hiiii", new VariableSTValue("hiiii", DATA_TYPES.STRING, false));
	
		assertEquals("hiiii", symTab.lookup("hiiii").getIdentifier());		
		assertEquals(DATA_TYPES.STRING, symTab.lookup("hiiii").getType());		
		assertEquals("y", symTab.lookup("y").getIdentifier());		
		assertEquals(DATA_TYPES.LETTER, symTab.lookup("y").getType());		
		assertEquals("abc", symTab.lookup("abc").getIdentifier());
		assertEquals(DATA_TYPES.NUMBER, symTab.lookup("abc").getType());		
		assertEquals("x", symTab.lookup("x").getIdentifier());
>>>>>>> 23e7b9785d0280e6e60c60cac184c4f932b58c4c
		assertEquals(DATA_TYPES.NUMBER, symTab.lookup("x").getType());		
	
		assertEquals(true, symTab.checkVariableIsInCurrentScopeLevel("x"));
		assertEquals(false, symTab.checkVariableIsInCurrentScopeLevel("r"));
	}


	@Test
	public void multipleScopingTest() {
		DATA_TYPES[] args = {DATA_TYPES.NUMBER, DATA_TYPES.LETTER, DATA_TYPES.STRING};
		DATA_TYPES retVal = DATA_TYPES.NUMBER;
<<<<<<< HEAD
		symTab.insert("x", new VariableSTValue( DATA_TYPES.NUMBER, false));
		symTab.insert("y", new VariableSTValue(DATA_TYPES.LETTER, false));
		symTab.insert("abc", new FunctionSTValue( symTab, args));
		symTab.insert("hiiii", new FunctionSTValue(retVal, symTab, args));
=======
		symTab.insert("x", new VariableSTValue("x", DATA_TYPES.NUMBER, false));
		symTab.insert("y", new VariableSTValue("y", DATA_TYPES.LETTER, false));
		symTab.insert("abc", new FunctionSTValue("abc", symTab, args));
		symTab.insert("hiiii", new FunctionSTValue("hiiii", retVal, symTab, args));
>>>>>>> 23e7b9785d0280e6e60c60cac184c4f932b58c4c
	
	}
	

}
