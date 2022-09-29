package labs_examples.static_nonstatic.labs;

public class FirstClass {

    public static void main(String[] args) {

        PrintInfoClass.printExerciseIntro();

        PrintInfoClass.printDividerLine();

        System.out.println("This code is running in the main method of the 1st Class:");

        PrintInfoClass.printDividerLine();

        firstStaticMethodInFirstClass();

        FirstClass firstClassObjInMain = new FirstClass();

        firstClassObjInMain.secondNostaticMethodInFirstClass();

        PrintInfoClass.printDividerLine();

        PrintInfoClass.printExerciseExit();

    }


    public static void firstStaticMethodInFirstClass(){
        System.out.println("Printing from 1st static method in 1st class");

        System.out.println("Now the 1st static method in the 1st class" +
                "\n is calling the 2nd static method in the first class");

        PrintInfoClass.printDividerLine();

        secondStaticMethodInFirstClass();

        PrintInfoClass.printDividerLine();

        System.out.println("Now the 1st static method in the 1st class" +
                "\n is calling the 2nd non-static method in the first class");

        FirstClass firstClassObj = new FirstClass();
        firstClassObj.firstNonstaticMethodInFirstClass();

        PrintInfoClass.printDividerLine();

        System.out.println("Now the 1st static method in the 1st class" +
                "\n is calling the 1st static method in the second class");

        SecondClass.firstStaticMethodInSecondClass();

        PrintInfoClass.printDividerLine();

        System.out.println("Now the 1st static method in the 1st class" +
                "\n is calling the 1st non-static method in the second class");

        SecondClass secondClassObj = new SecondClass();

        secondClassObj.firstNonstaticMethodInSecondClass();

        PrintInfoClass.printDividerLine();


    }

    public static void secondStaticMethodInFirstClass(){
        System.out.println("Printing from 2nd static method in 1st class");
    }

    public void firstNonstaticMethodInFirstClass(){
        System.out.println("Printing from 1st non-static method in 1st class");
    }

    public void secondNostaticMethodInFirstClass(){
        System.out.println("Printing from 2nd non-static method in 1st class");

        PrintInfoClass.printDividerLine();

        System.out.println("Now the 2nd non-static method in the 1st class" +
                "\n is calling the 1st non-static method in the second class");

        firstNonstaticMethodInFirstClass();

        PrintInfoClass.printDividerLine();

        System.out.println("Now the 2nd non-static method in the 1st class" +
                "\n is calling the 1st static method in the second class");

        SecondClass.firstStaticMethodInSecondClass();

        PrintInfoClass.printDividerLine();

        SecondClass secondClassObj = new SecondClass();

        System.out.println("Now the 2nd non-static method in the 1st class" +
                "\n is calling the 2nd static non-static method in the second class");

        secondClassObj.secondNonstaticMethodInSecondClass();



    }
}
