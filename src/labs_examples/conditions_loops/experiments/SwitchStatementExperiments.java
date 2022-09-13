package labs_examples.conditions_loops.labs;

public class SwitchStatementExperiments {
    public static void main(String[] args) {
        // please demonstrate the use of a switch statement below - have a
        // "System.out.println()" statement print for each "case" - be sure to include
        // "break" statements in each case
        System.out.println("------------------------------------------");
        System.out.println("This is with breaks:");
        String day = "Friday";

        switch (day) {
            case "Monday":
                System.out.println("Today is: ".concat(day));
                break;
            case "Tuesday":
                System.out.println("Today is: ".concat(day));
                break;
            case "Wednesday":
                System.out.println("Today is: ".concat(day));
                break;
            case "Thursday":
                System.out.println("Today is: ".concat(day));
                break;
            case "Friday":
                System.out.println("Today is: ".concat(day));
                break;
            case "Saturday":
                System.out.println("Today is: ".concat(day));
                break;
            case "Sunday":
                System.out.println("Today is: ".concat(day));
                break;
            default:
                System.out.println("This isn't a day: " + day);
        }

        System.out.println("------------------------------------------");
        System.out.println("This is without breaks:");
        // once you've got that done - run the switch statement with and without the
        // break statements for each case - what happens when we don't have break
        // statements?
        String meal = "Dinner";

        switch (meal) {
            case "Breakfast":
                System.out.println("Had this meal: ".concat(meal));
            case "Brunch":
                System.out.println("Had this meal: ".concat(meal));
            case "Lunch":
                System.out.println("Had this meal: ".concat(meal));
            case "Dinner":
                System.out.println("Had this meal: ".concat(meal));
            case "Snack":
                System.out.println("Had this meal: ".concat(meal));
            default:
                System.out.println("Had a possibly non-existent meal: " + meal);
        }

        System.out.println("=============================================================");
        int i = 1;
        switch(i) {
            case 0:
                System.out.println("i is zero");
            case 1:
                System.out.println("i is one");
            case 2:
                System.out.println("i is two");
            case 3:
                System.out.println("i is three");
            case 4:
                System.out.println("i is four");
            default :
                System.out.println("i is not 0, 1, 2, 3 or 4");
        }

        int intVar;

        //switch (str) {
        //    case "one":
        //        intVar = 1;
        //        System.out.println(intVar);
        //        break;
        //    case "two":
        //        intVar = 2;
         //       System.out.println(intVar);
         //       break;
        //    case "three":
        //        intVar = 3;
        //        System.out.println(intVar);
        //        break;
        //    case "four":
        //        intVar = 4;
       //         System.out.println(intVar);
        //        break;

        //    default:
        //        intVar = -1;
        //        System.out.println(intVar);
                //return intVar;
        //}
    }
}
