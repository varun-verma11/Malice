package symbol_table;

public interface SymbolTableInterface<K, V> {
	public V lookup(K key);
	public void insert(K name, V value) ;
}
