package labs_examples.packages.labs.package_1;
import labs_examples.packages.labs.package_2.Package2Class1;


public class Package1Class1 {
    public static void main(String[] args) {
        Package2Class1 package2Class1 = new Package2Class1();

        System.out.println("--------------------------------------------------");
        System.out.println(
                "This is the lab for the packages "
                + "\nand protected access modifier"
        );

        System.out.println("--------------------------------------------------");
        System.out.println("Calling the first method in the 2nd package works:");
        package2Class1.firstMethodInSecondPackage();

        System.out.println("--------------------------------------------------");

        System.out.println(
                "Calling the second method in the 2nd package doesn't work:"
                + "\nit will raise an error because it is protected;"
                + "\ntherefore, I have commented it out below"
        );

        //package2Class1.secondMethodInSecondPackage();

        System.out.println("--------------------------------------------------");
    }

    protected String var1;
    protected String var2;
    protected int var3;

    public static void firstMethodInFirstPackage(){
        System.out.println("This is printing from 1st method in 1st package");
    }

    protected static void secondMethodInFirstPackage(){
        System.out.println("This is printing from 2nd method in 1st package");
    }
}
