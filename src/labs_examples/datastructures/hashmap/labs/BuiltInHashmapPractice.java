package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static labs_examples.datastructures.hashmap.labs.StatusOptions.PROFESSIONAL;


public class BuiltInHashmapPractice {
    public static void main(String[] args) {

        PrintInfoClass.printExerciseIntro("Built-In Hashmap practice");
        HashMap<String, Status> studentAndStatus = new HashMap();

        PrintInfoClass.printDividerLine();
        System.out.println("Add some values:");
        studentAndStatus.put("Susan", new Status(PROFESSIONAL));
        studentAndStatus.put("Sarah", new Status(StatusOptions.INTERMEDIATE));
        studentAndStatus.put("Larry", new Status(StatusOptions.BEGINNER));
        studentAndStatus.put("Barry", new Status(StatusOptions.INTERMEDIATE));
        studentAndStatus.put("Mary", new Status(StatusOptions.INTERMEDIATE));

        HashMap<String, Status> copyOfStudentAndStatus = new HashMap<String, Status>();
        copyOfStudentAndStatus.putAll(studentAndStatus);
        copyOfStudentAndStatus.put("Alex", new Status(StatusOptions.INTERMEDIATE));

        PrintInfoClass.printDividerLine();
        System.out.println("Get get an entry:");
        StatusOptions statusOptions = studentAndStatus.get("Mary").getStatus();
        System.out.println("Mary's status is: " + statusOptions);

        PrintInfoClass.printDividerLine();

        System.out.println("Each element (key and value) in the HashMap using entries");
        PrintInfoClass.printDividerLine();
        Set entries = studentAndStatus.entrySet();
        Iterator iterator = entries.iterator();
        while(iterator.hasNext()) {
            // get each Entry individually
            Map.Entry studentStatus = (Map.Entry)iterator.next();
            // print out the entry's key and value

            System.out.println("The key (student) is: "+ studentStatus.getKey()
                    + " and the value (status) is: " + studentStatus.getValue());
        }

        System.out.println("Each element (key and value) in the HashMap using forEach");
        PrintInfoClass.printDividerLine();
        copyOfStudentAndStatus.forEach((key, value) -> {
            System.out.println("The key (student) is: "
                    + key + ",and the value(status) is: "
                    + value.getStatus());
        });

        PrintInfoClass.printDividerLine();
        System.out.println("Remove an item, and check if it's there with containsKey/containsValue:");
        PrintInfoClass.printDividerLine();

        studentAndStatus.remove("Larry");
        System.out.println(studentAndStatus.containsKey("Larry"));
        System.out.println(studentAndStatus.containsValue(new Status (StatusOptions.INTERMEDIATE)));

        PrintInfoClass.printDividerLine();
        System.out.println("Use putIfAbsent for an item that is already there:");
        PrintInfoClass.printDividerLine();

        studentAndStatus.putIfAbsent("Sarah", new Status(StatusOptions.INTERMEDIATE));
        System.out.println(studentAndStatus.containsKey("Sarah"));
        // this doesn't work:
        System.out.println(studentAndStatus.containsValue(new Status(StatusOptions.BEGINNER)));

        studentAndStatus.replace("Sarah", new Status(StatusOptions.PROFESSIONAL));
        statusOptions = studentAndStatus.get("Sarah").getStatus();
        System.out.println("The status of Sarah is: " + statusOptions);

        PrintInfoClass.printDividerLine();
        System.out.println("Clear the copy of the hashmap");
        PrintInfoClass.printDividerLine();

        copyOfStudentAndStatus.clear();
        System.out.println("The hashmap has been cleaed: " + copyOfStudentAndStatus.isEmpty());

        PrintInfoClass.printExerciseExit("Built-In Hashmap practice");
    }


}
