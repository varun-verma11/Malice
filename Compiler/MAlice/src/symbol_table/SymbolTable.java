package symbol_table;

import java.util.HashMap;
import java.util.Map;


/**
 * This class captures the state and behavior of a symbol table object and includes the 
 * methods for inserting and looking up the items stored in the table.
 */
public class SymbolTable implements SymbolTableInterface<String, SymbolTableValue>
{
	/**
	 *  @field table  				Table of identifiers of functions and 
	 *  							variables with their corresponding 
	 *  							SymbolTableValues.
	 *  @field currentScopeLevel 	Level of the current scope.
	 *  @field enclosingSymbolTable Parent of the current Symbol Table. 
	 */
	private Map<String,SymbolTableValue> table;
	private int currentScopeLevel;
	private SymbolTable enclosingSymbolTable;

	/**
	 * Constructor for the SymbolTable
	 */
	public SymbolTable()
	{
		this.table = new HashMap<String, SymbolTableValue>();
		this.currentScopeLevel = 0;
		this.enclosingSymbolTable = null;
	}

	/**
	 * Method for checking whether a variable or function was already declared
	 * in current scope.
	 *  
	 * @param var	The name of the variable or function.
	 * @return		True if the variable or function was declared in the current
	 * 				scope, false otherwise.
	 */
	public boolean checkItemIsInCurrentScopeLevel(String var) 
	{
		return table.containsKey(var);
	}
	
	/**
	 * Method that checks if the variable or function was declared before in the current 
	 * scope and all the previous scopes. 
	 * 
	 * @param name	The name of variable or function.
	 * @return		True if the variable was declared before, false otherwise.
	 */
	public boolean checkItemWasDeclaredBefore(String name)
	{
		SymbolTable currTable = this;
		int currScopeLevel = this.currentScopeLevel;
		while (currScopeLevel > 0) {
			if (currTable.checkItemIsInCurrentScopeLevel(name)) {return true;} 
			currTable = currTable.enclosingSymbolTable;
			currScopeLevel--;

		}

		return currTable.checkItemIsInCurrentScopeLevel(name);
	}


	/**
	 * Method for getting the integer representing the current scope level, 
	 * starting from zero and increasing by 1 with every new scope created.
	 * 
	 * @return	integer representing the current scope level.
	 */
	public int getCurrentScopeLevel() {
		return currentScopeLevel;
	}

	/**
	 * Method that updates the currentScopeLevel field of the current Symbol
	 * Table.
	 * 
	 * @param level		the new scope level.
	 */
	public void updateCurrentScopeLevel(int level){
		this.currentScopeLevel = level;
	}

	/**
	 * Method for getting the table field of the SymbolTable.
	 * 
	 * @return	HashMap representing the symbol table.
	 */
	public Map<String,SymbolTableValue> getSymbolTable()
	{
		return table;
	}

	/**
	 * Method that check if the given variable was initialised before.
	 * 
	 * @param var	the name of the variable.
	 * @return		True if the variable was initialised before.
	 */
	public boolean isVariableInitialised(String var)
	{
		return ((VariableSTValue)table.get(var)).isInitialised();
	}

	/**
	 * An implementation of the insert method of SymbolTableInterface, inserts 
	 * the given identifier with its corresponding value into the symbol table. 
	 * 
	 * @param name	 the identifier of the variable or function.
	 * @param value  the value of the variable or function.
	 */
	@Override	
	public void insert(String name, SymbolTableValue value) 
	{
		assert(!checkItemWasDeclaredBefore(name));
		table.put(name, value);
	}

	/**
	 * An implementation of the lookup method of SymbolTableInterface, uses the 
	 * HashMap function get to check if the item is already in the table.
	 * 
	 * @param name 	the identifier of the variable or function.
	 */
	@Override  
	public SymbolTableValue lookup(String name) 
	{
		return table.get(name);
	}

	/**
	 * Method for finalizing the current scope - it decreases the current scope 
	 * level by one, creates a new symbol table, sets it to the enclosing 
	 * table of the current symbol table and returns it.
	 *  
	 * @return 	the previous scope table.
	 */
	public SymbolTable finalizeCurrentScopeLevelTable() 
	{
		if (currentScopeLevel > 0)
		{
			SymbolTable currTable = enclosingSymbolTable;
			currentScopeLevel--;
			return currTable;
		}
		throw new AssertionError();
	}

	/**
	 * Method for getting the enclosing symbol table (the 'parent' of the 
	 * current symbol table).
	 * 
	 * @return 	the enclosing symbol table.
	 */
	public SymbolTable getEnclosingSymbolTable() 
	{
		return enclosingSymbolTable;
	}

	/**
	 * Method that sets the enclosing symbol table field of the current symbol 
	 * table to the table passed as the parameter of the function. 
	 * 
	 * @param table		the new enclosing symbol table.
	 */
	public void setEnclosingSymbolTable(SymbolTable table) 
	{
		this.enclosingSymbolTable = table;
	}

}


