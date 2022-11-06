package labs_examples.datastructures.hashmap.labs;

public class EntryClass<K, V> {
    private K key;
    private V value;
    // this is a LinkedList
    EntryClass next = null;

    EntryClass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
