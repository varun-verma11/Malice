package symbol_table;

import java.util.HashMap;
import java.util.Map;
										//do we need extends comparable here???
public class SymbolTable implements SymbolTableInterface<String, SymbolTableValue>
{
	private Map<String,SymbolTableValue> symbolTable = new HashMap<String, SymbolTableValue>();
	private int currentScopeLevel = 0;
	
	public boolean checkVariableIsInCurrentScopeLevel(String var) 
	{
		return symbolTable.containsKey(var);
	}
<<<<<<< HEAD
	
	private void updateCurrentScopeLevel(int level){
		this.currentScopeLevel = level;
=======

	public boolean checkVariableIsInOtherScopeLevels(String var)
	{
		for(int i = 0; i < currentScopeLevel; i++) {
			if (checkVariableIsInCurrentScopeLevel(var)) {return true;} 
		}
		return false;
	}

	public int getCurrentScopeLevel() {
		return currentScopeLevel;
>>>>>>> b70c12b10bb0579e542098bd11677d73a865b42a
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
	
	@Override
	public void insert(String name, SymbolTableValue value) 
	{
		symbolTable.put(name, value);		
	}

	@Override  //need to change this so that it makes sure it looks in other scopes!!!!
	public SymbolTableValue lookup(String name) 
	{
		return symbolTable.get(name);
	}
	
}
