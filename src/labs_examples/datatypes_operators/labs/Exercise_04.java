package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        System.out.println("");
        System.out.println("-----------------------------------------------");
        int a = 1;
        int b = 2;
        System.out.println("These are the 5 basic operators:".toUpperCase());
        if (a < b){
            System.out.println("a is less than b");
        }
        if (a <= b) {
            System.out.println("a equals or is less than b");
        }
        if (b >= a) {
            System.out.println("b equals or is greater that a");
        }
        if (b > a) {
            System.out.println("b is greater than a");
        }
        if (a == 1) {
            System.out.println("a equals 1");
        }

        System.out.println("-----------------------------------------------");

        // write your code below

    }

}

