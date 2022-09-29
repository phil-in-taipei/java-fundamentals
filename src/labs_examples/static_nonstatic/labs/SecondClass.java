package labs_examples.static_nonstatic.labs;

public class SecondClass {

    public static void main(String[] args) {

    }

    public static void firstStaticMethodInSecondClass(){
        System.out.println("Printing from 1st static method in 2nd class");
        //methodB();
    }

    public static void secondStaticMethodInSecondClass(){
        System.out.println("Printing from 2nd static method in 2nd class");
    }

    public void firstNonstaticMethodInSecondClass(){
        System.out.println("Printing from 1st non-static method in 2nd class");
    }

    public void secondNonstaticMethodInSecondClass(){
        System.out.println("Printing from 2nd non-static method in 2nd class");
    }

}
