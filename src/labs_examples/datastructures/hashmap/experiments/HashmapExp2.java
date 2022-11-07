package labs_examples.datastructures.hashmap.experiments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapExp2 {
    public static void main(String[] args) {
        // instantiate new HashMap to hold country names and their populations
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();

        // add "China" and 1420062022 to the map
        myMap.put("China", 1420062022);

        // add "India" and 1368737513 to the map
        myMap.put("India", 1368737513);

        // add "USA" and 329093110 to the map
        myMap.put("USA", 329093110);

        // add "Indonesia" and 269536482 to the map
        myMap.put("Indonesia", 269536482);


        // add "Brazil" and 212392717 to the map
        myMap.put("Brazil", 212392717);


        // get the population value for key = "China" and store in a variable
        // print China's population
        Integer population = myMap.get("China");
        System.out.println(population);


        // get the population value for key = "India" and store in a variable
        // print India's population
        population = myMap.get("India");
        System.out.println(population);


        // get the population value for key = "USA" and store in a variable
        // print USA's population
        population = myMap.get("USA");
        System.out.println(population);


        // get the population value for key = "Indonesia" and store in a variable
        // print Indonesia's population
        population = myMap.get("Indonesia");
        System.out.println(population);


        // get the population value for key = "Brazil" and store in a variable
        // print Brazil's population
        population = myMap.get("Brazil");
        System.out.println(population);



        // demonstrate iterating through the entries of a HashMap
        // create a Set of entries from the entrySet
        // create an Iterator from that entrySet
        Set entries = myMap.entrySet();
        Iterator iterator = entries.iterator();


        // loop through the entries using the iterator

        // get each Entry individually
        // print out the entry's key and value
        while(iterator.hasNext()) {
            // get each Entry individually
            Map.Entry data = (Map.Entry)iterator.next();
            // print out the entry's key and value
            System.out.print("Key = " + data.getKey() + " -> Value = " + data.getValue());
            System.out.println();
        }
    }
}
