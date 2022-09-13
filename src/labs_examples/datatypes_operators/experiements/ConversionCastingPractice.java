package labs_examples.datatypes_operators.labs;

public class ConversionCastingPractice {
    public static void main(String[] args) {

        double val = 23.45;
        int intVal = (int) val;
        System.out.println(intVal);

        int intVal2 = 10;
        double dVal2 = intVal2;
        System.out.println(dVal2);

        System.out.println("Testing variable questions:");
        // declare and initialize a char variable
        System.out.println("---------------------------------------------------------------");
        System.out.println("Testing variable char:");
        char c = 'a';
        System.out.println(c);

        // declare and initialize a byte variable
        System.out.println("");
        System.out.println("Testing variable byte:");
        byte bVar = 8;
        byte bVar2 = (byte) 1001;
        System.out.println(bVar);
        System.out.println(bVar2);

        // declare and initialize a float variable
        System.out.println("");
        System.out.println("Testing variable float:");
        float movAvVar = 123.45f;
        System.out.println(movAvVar);

        // declare and initialize a double variable
        System.out.println("");
        System.out.println("Testing variable double:");
        double average = 123.45;
        System.out.println(average);

        System.out.println("");
        System.out.println("----------------------------------------------------");

        int x = 5;
        int y = 2;
        int result = x / y;
        System.out.println(result);

        System.out.println("");

        // please demonstrate converting an int to a double below - example - why don't
        // we need to cast the int to a double?
        // casting unnecessary when widening


        System.out.println("Converting int to double:");
        int iVar = 10000;
        System.out.println(iVar);
        double dVar = iVar;
        System.out.println(dVar);

        System.out.println("");

        // please demonstrate casting a double to an int below
        System.out.println("Casting double to int:");
        System.out.println(
                "Note: it rounds to the floor".toUpperCase()
        );

        double dVar2 = 100000.2;
        System.out.println(dVar2);
        int iVar2 = (int) dVar2;
        System.out.println(iVar2);

        System.out.println("");

        // please demonstrate casting a double to a float below
        System.out.println("Casting double to float:");
        System.out.println(
                "Note: it rounds to less decimal places".toUpperCase()
        );
        double dVar3 = 100000.240983088232d;
        System.out.println(dVar3);

        float fVar = (float) dVar3;
        System.out.println(fVar);

        System.out.println("");

        // please demonstrate casting a double with decimal values to an short
        // now print out the short value - what happened to the decimals?
        System.out.println("Casting double (with 2 decimals) to short:");
        System.out.println(
                "Note: it rounds to floor here".toUpperCase()
        );
        double dVar4 = 98.76;
        System.out.println(dVar4);

        short shVar = (short)dVar4;
        System.out.println(shVar);

        // experiment for fun with larger number
        System.out.println("-------------------------------------------");
        System.out.println("Casting larger double (with 10 decimals) to short:");
        System.out.println(
                "Note: it outputs something else here".toUpperCase()
        );
        double dVar5 = 123939091830918032121.9282928101d;
        System.out.println(dVar5);

        short shVar2 = (short)dVar5;
        System.out.println(shVar2);
    }
}
