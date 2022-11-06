package labs_examples.datastructures.hashmap.labs;

public class CustomHashMapPractice<K, V> {
    private EntryClass<K, V>[] entryArray = new EntryClass[10];

    private int numOfItemsInHashmap = 0;


    public void addNewItem(K key, V value) {
        // call the hash() method to get the index to place the element
        int index = hashItem(key);

        // create the Entry object containing the key and value that we will store in the underlying array
        EntryClass<K,V> entry = new EntryClass(key, value);

        // no element at the given index, means no collision
        // go ahead and simply add the value to the array
        if (entryArray[index] == null) {

            entryArray[index] = entry;
            numOfItemsInHashmap++;
        }
        // otherwise, there was a collision
        // we need iterate through the linked list at that index
        else {
            EntryClass<K, V> p = entryArray[index];

            // traverse the linked list
            while (p.next != null) {
                p = p.next;
            }
            p.next = entry;
            numOfItemsInHashmap++;
        }

        // check for resize
        if (numOfItemsInHashmap > entryArray.length * .5) {
            tripleHashmapSize();
        }
    }

    public int getHashmapSize() {
        return entryArray.length;
    }

    public int getNumOfItemsInHashmap() {
        return numOfItemsInHashmap;
    }

    public V getValueWithKey(K key) {
        // call the hash() method to get the index for the key
        int index = hashItem(key);

        // nothing at key - return null
        if (entryArray[index] == null) {
            return null;
        }

        // otherwise, get the Entry at the index
        EntryClass<K, V> entry = entryArray[index];

        // if the key of the current entry is not the key we're looking for
        // that means we're looking at a linked list and we need to traverse it
        // if the key does match right from the start, this loop will be skipped
        while (entry.getKey() != key) {

            // if we reach the end of the list and haven't found it return null
            if (entry.next == null) {
                PrintInfoClass.printItemDoesNotExist();
                return null;
            }

            // otherwise, keep traversing the linked list
            entry = entry.next;
        }

        // if we get here, that means the key has been found, return the value
        return entry.getValue();
    }


    private int hashItem(K key) {
        // get the hashCode for the key and mod that hashCode by the length of the array
        int indexOfItem = Math.abs(key.hashCode() % entryArray.length);
        // the result will be the index where we can find and/or place entries
        return indexOfItem;
    }

    public void removeItem(K key) {

        // ensure key exists by calling the get() method
        if (getValueWithKey(key) == null) {
            // if the get() method returns null, there's nothing to delete
            return;
        }

        // otherwise, get the index for the key by calling the hash() method
        int index = hashItem(key);

        // get the Entry at the index
        EntryClass<K, V> entry = entryArray[index];

        // if this entry has the matching key, remove the element at this index
        if (entry.getKey().equals(key)){
            entryArray[index] = null;
            numOfItemsInHashmap--;
            return;
        }

        // otherwise, if the next element in the linked list is not null
        while (entry.next != null ) {
            // if the key of the next element in the linked list is not the key we're looking for
            if (entry.next.getKey() != key) {
                // traverse the linked list to the next node
                entry = entry.next;
            }
        }
        if(entry.next.next != null){
            entry.next = entry.next.next;
            numOfItemsInHashmap--;
            return;
        }
        else {
            entry.next = null;
            numOfItemsInHashmap--;
            return;
        }
    }


    private void tripleHashmapSize() {
        // make a copy of the existing table and call it "old"

        EntryClass<K, V>[] oldEntryArray = entryArray;
        // create a new Entry[] that is twice the size of the old one
        entryArray = new EntryClass[oldEntryArray.length * 3];

        // iterate over the length of the old array
        for (int i = 0; i < oldEntryArray.length; i++) {
            try {
                // get the Entry at the index of "i" from the "old" table
                EntryClass entry = oldEntryArray[i];
                // call the put() method passing the key and value to add this element to the new table
                addNewItem((K) entry.getKey(), (V) entry.getValue());

                // check to see if this entry is actually the start of a linked list
                while (entry.next != null) {
                    // if it is, traverse to the next node
                    entry = entry.next;
                    // and call the put() method to add this element
                    addNewItem((K) entry.getKey(), (V) entry.getValue());
                    // loop
                }
            } catch (Exception e) {
                // do nothing - this is just to handle empty indexes
            }
        }
    }

}
