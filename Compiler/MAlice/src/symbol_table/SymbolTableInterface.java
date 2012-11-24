package symbol_table;

public interface SymbolTableInterface<K, V> {
	public String lookup(K key);
	public void insert(K name, V value) ;
}
