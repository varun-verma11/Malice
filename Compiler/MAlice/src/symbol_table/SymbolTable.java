package symbol_table;

import java.util.HashMap;
import java.util.Map;
										//do we need extends comparable here???
public class SymbolTable implements SymbolTableInterface<String, SymbolTableValue>
{
	private Map<String,SymbolTableValue> symbolTable;
	private int currentScopeLevel;
	private SymbolTable enclosingSymbolTable;
	
	public SymbolTable()
	{
		this.symbolTable = new HashMap<String, SymbolTableValue>();
		this.currentScopeLevel = 0;
		this.enclosingSymbolTable = null;
	}
	
	public boolean checkVariableIsInCurrentScopeLevel(String var) 
	{
		return symbolTable.containsKey(var);
	}
	
	public boolean checkVariableIsInOtherScopeLevels(String var, int currScopeLevel)
	{	SymbolTable currTable = this;
	
		while (currScopeLevel < 0) {
			if (checkVariableIsInCurrentScopeLevel(var)) {return true;} 
			currScopeLevel--;
			currTable = this.enclosingSymbolTable;
		}
		if (checkVariableIsInCurrentScopeLevel(var)) {return true;} 
	
		return false;
	}
	
	public boolean checkItemWasDeclaredBefore(String name)
	{
		return this.checkVariableIsInOtherScopeLevels(name, currentScopeLevel);
	}


	public int getCurrentScopeLevel() {
		return currentScopeLevel;
	}
	
	public void updateCurrentScopeLevel(int level){
		this.currentScopeLevel = level;
	}
	
	public Map<String,SymbolTableValue> getSymbolTable()
	{
		return symbolTable;
	}
	
	public boolean isVariableInitialised(String var)
	{
		return ((VariableSTValue)symbolTable.get(var)).isInitialised();
	}
	
	@Override	//check if this works cause eclipse is being weird
	public void insert(String name, SymbolTableValue value) 
	{
		assert(!checkItemWasDeclaredBefore(name));
		symbolTable.put(name, value);
		
	}

	@Override  
	public SymbolTableValue lookup(String name) 
	{
		return symbolTable.get(name);
	}
	
	public void finalizeCurrentScopeLevelTable() 
	{
		assert (currentScopeLevel != 0);
		symbolTable = enclosingSymbolTable.getSymbolTable();
		//symbolTable = null;
		currentScopeLevel--;
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


