package labs_examples.datatypes_operators.labs;

public class OperatorsPractice {
    public static void main(String[] args) {
        // please demonstrate the use of all 5 arithmetic operators below (+, -, *, /, %)

        System.out.println("");

        System.out.println("Testing the questions:");
        System.out.println("This shouldn't be true:");
        System.out.println(17 % 3 == 1);
        System.out.println("Let's see what happens");
        double aDouble = 20.45;
        int bInt = 5;
        int cIntRes = (int) aDouble / bInt;
        System.out.println(cIntRes);


        // please dmonstrate the use of off 5 relational operators below - we'll cover "if-statements" shortly so I'll give you a hint here
        System.out.println("");
        System.out.println("-----------------------------------------------");
        int a = 10;
        int b = 11;
        System.out.println("");
        System.out.println("These are the 5 basic operators:");
        if (a < b){
            System.out.println("a is less than b");
        }
        // now your turn :)
        if (a > b) {
            System.out.println("a is greater than b");
        }
        if (a == 10) {
            System.out.println("a equals 10");
        }
        if (a >= 10) {
            System.out.println("a equals or is greater that 10");
        }
        if (b <= 11) {
            System.out.println("a equals or is less that 10");
        }

        System.out.println("");
        System.out.println("-----------------------------------------------");

        // please demonstrate the use of all 4 logical operators below (AND, short-circuit AND, OR, short-circuit OR, XOR (exclusive or), and NOT )
        System.out.println("");
        System.out.println("Now for some logical operators:");
        System.out.println("");


        System.out.println("And example of AND:");
        if (a < 20 & b < 20){
            System.out.println("both a & b are less than 20");
        }

        System.out.println("");
        // now your turn :)

        System.out.println("And example of short-circuit AND");
        if (a < 11 && b == 11){
            System.out.println("First of all, a is less than 11, and second of all, it's true that b equals eleven");
        }

        System.out.println("");

        System.out.println("And example of OR:");
        if (a > 10 | b > 10){
            System.out.println("Either a is greater than 10 or b is greater than 10");
        }

        System.out.println("");

        System.out.println("And example of short-circuit or:");
        if (a < 11 || b != 11){
            System.out.println("First of all, a is less than 11, so no need to check whether or not b doesn't equal eleven");
        }

        System.out.println("");
        System.out.println("An example of exclusive or:");
        if (a == 11 ^ b == 11){
            System.out.println("Of a and b, one of them equals 11, but not the other one");
        }

        System.out.println("");
        System.out.println("An example of NOT:");
        if (a != b) {
            System.out.println("A does not equal b");
        }
        System.out.println("-----------------------------------------------");


    }
}
