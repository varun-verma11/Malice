package symbol_table;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable implements SymbolTableInterface<String, SymbolTableValue>
{
	private Map<String,SymbolTableValue> table;
	private int currentScopeLevel;
	private SymbolTable enclosingSymbolTable;

	public SymbolTable()
	{
		this.table = new HashMap<String, SymbolTableValue>();
		this.currentScopeLevel = 0;
		this.enclosingSymbolTable = null;
	}

	public boolean checkItemIsInCurrentScopeLevel(String var) 
	{
		return table.containsKey(var);
	}

	public boolean checkItemWasDeclaredBefore(String name)
	{
		SymbolTable currTable = this;
		int currScopeLevel = this.currentScopeLevel;
		while (currScopeLevel > 0) {
			if (currTable.checkItemIsInCurrentScopeLevel(name)) {return true;} 
			currTable = currTable.enclosingSymbolTable;//or curr.encltab??
			currScopeLevel--;

		}

		return currTable.checkItemIsInCurrentScopeLevel(name);
	}


	public int getCurrentScopeLevel() {
		return currentScopeLevel;
	}

	public void updateCurrentScopeLevel(int level){
		this.currentScopeLevel = level;
	}

	public Map<String,SymbolTableValue> getSymbolTable()
	{
		return table;
	}

	public boolean isVariableInitialised(String var)
	{
		return ((VariableSTValue)table.get(var)).isInitialised();
	}

	@Override	
	public void insert(String name, SymbolTableValue value) 
	{
		assert(!checkItemWasDeclaredBefore(name));
		table.put(name, value);

	}

	@Override  
	public SymbolTableValue lookup(String name) 
	{
		return table.get(name);
	}

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

	public SymbolTable getEnclosingSymbolTable() 
	{
		return enclosingSymbolTable;
	}

	public void setEnclosingSymbolTable(SymbolTable table) 
	{
		this.enclosingSymbolTable = table;
	}

}


