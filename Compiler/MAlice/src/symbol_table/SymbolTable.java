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
=======
<<<<<<< HEAD
	
	private void updateCurrentScopeLevel(int level){
		this.currentScopeLevel = level;
=======
>>>>>>> 23e7b9785d0280e6e60c60cac184c4f932b58c4c

	public boolean checkVariableIsInOtherScopeLevels(String var)
	{
		for(int i = 0; i < currentScopeLevel; i++) {
			if (checkVariableIsInCurrentScopeLevel(var)) {return true;} 
		}
		return false;
	}

	public int getCurrentScopeLevel() {
		return currentScopeLevel;
<<<<<<< HEAD
=======
>>>>>>> b70c12b10bb0579e542098bd11677d73a865b42a
>>>>>>> 23e7b9785d0280e6e60c60cac184c4f932b58c4c
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
