package labs_examples.datastructures.hashmap.experiments;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapExperiment {
    public static void main(String[] args) {
        HashMap<String, Integer> cityPopulations = new HashMap();

        // add several cities (key )and their populations (value )to the HashMap
        cityPopulations.put("Whosville", 43024);
        cityPopulations.put("Whensville", 2820481);
        cityPopulations.put("Wheresvilles", 82843742);
        cityPopulations.put("Howsville", 5332);

        // retrieve the population of each city using the key
        Integer population = cityPopulations.get("Wheresvilles");
        System.out.println("The popularion of Wheresville is: " + population);

        // print each element (key and value) in the HashMap
        Set entries = cityPopulations.entrySet();
        Iterator iterator = entries.iterator();
        while(iterator.hasNext()) {
            // get each Entry individually
            Map.Entry cityPopulation = (Map.Entry)iterator.next();
            // print out the entry's key and value
            System.out.println("The key (city name) is: "+ cityPopulation.getKey()
                    + " and the value (city population) is: " + cityPopulation.getValue().toString());
        }

        // demonstrate at least 3 other HashMap methods
        cityPopulations.remove("Howsville");
        System.out.println(cityPopulations.containsKey("Howsville"));
        System.out.println(cityPopulations.containsValue(320832032));
        cityPopulations.putIfAbsent("Whosville", 320832032);
        System.out.println(cityPopulations.containsValue(320832032));
        population = cityPopulations.get("Whosville");
        System.out.println("The popularion of Whosville is: " + population);

    }
}
