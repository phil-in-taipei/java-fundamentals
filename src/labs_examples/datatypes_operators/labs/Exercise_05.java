package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("these are examples of logical operators".toUpperCase());
        System.out.println("-----------------------------------------------");
        // example of "OR"
        System.out.println("Example of OR:");
        System.out.println("aBoolVar = true;");
        System.out.println("bBoolVar = false;");
        boolean aBoolVar = true;
        boolean bBoolVar = false;
        if (aBoolVar | bBoolVar){
            System.out.println("aBoolVar or bBoolVar is true");
        }
        System.out.println("-----------------------------------------------");
        // write your code below
        int aIntVar = 10;
        int bIntVar = 11;
        System.out.println("aIntVar = 10");
        System.out.println("aIntVar = 11");
        System.out.println("-----------------------------------------------");

        System.out.println("An example of AND:");
        if (aIntVar < 20 & bIntVar < 20){
            System.out.println("both aIntVar & bIntVar are less than 20");
        }
        System.out.println("-----------------------------------------------");
        System.out.println("An example of short-circuit or:");
        if (aIntVar < 11 || bIntVar != 11){
            System.out.println(
                    "First of all, aIntVar is less than 11, so " +
                            "\n no need to check whether or not bIntVar \n" +
                            "doesn't equal eleven"
            );
        }


        System.out.println("-----------------------------------------------");
        System.out.println("An example of short-circuit AND");
        if (aIntVar < 11 && bIntVar == 11){
            System.out.println("First of all, aIntVar is less than 11, \n" +
                    "and second of all, it's true that bIntVar \n" +
                    "equals eleven");
        }

        System.out.println("-----------------------------------------------");
        System.out.println("An example of exclusive or aka XOR:");
        if (aIntVar == 11 ^ bIntVar == 11){
            System.out.println("Of aIntVar and bIntVar, one of \n" +
                    "them equals 11, but not the other one");
        }

        System.out.println("-----------------------------------------------");
        System.out.println("An example of NOT:");
        if (aIntVar != bIntVar) {
            System.out.println("aIntVar does not equal bintVar");
        }
        System.out.println("-----------------------------------------------");
        System.out.println("");

    }

}

