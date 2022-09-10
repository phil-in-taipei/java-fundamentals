package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_YELLOW = "\u001B[33m";

        // write code here
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Going to calculate properties of a cylinder".toUpperCase());
        System.out.println("---------------------------------------------------------------------");
        System.out.println("With the following dimensions and numerals:");
        System.out.println("---------------------------------------------------------------------");

        double pi = Math.PI;
        System.out.println("This is pi:");
        System.out.println(pi);
        System.out.println("This is the radius of the cylinder:");
        double radius = 3.14;
        System.out.println(radius);
        System.out.println("This is the height of the cylinder:");
        double height = 5;
        System.out.println(height);

        System.out.println("--------------------------------------------------------------------");
        System.out.println("This is how surface is calculated:");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("S = 2πr(h+r)");
        System.out.println("---------------------------------------------------------------------");

        System.out.println("This is pi multiplied by 2:");
        double doublePie = 2 * pi;
        System.out.println(doublePie);

        System.out.println("This is twice pi multiplied by the radius:");
        double doublePieTimesRadius = doublePie * radius;
        System.out.println(doublePieTimesRadius);

        System.out.println("Now, we will multiply that by the sum of the height and the radius");
        System.out.println("This is the height + the radius:");
        double heightPlusRadius = height + radius;
        System.out.println(heightPlusRadius);

        double surface = doublePieTimesRadius * heightPlusRadius;
        System.out.println("I think it's this value:");

        System.out.println(ANSI_YELLOW
                + "Surface: "
                + surface
                + ANSI_RESET);

        System.out.println("--------------------------------------------------------------------");
        System.out.println("This is how volume is calculated:");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("V = πr2h");
        System.out.println("---------------------------------------------------------------------");

        double volume = pi * radius * 2 * height;
        System.out.println("I think it's this value:");
        System.out.println(ANSI_YELLOW
                + "Volume: "
                + volume
                + ANSI_RESET);
        System.out.println("---------------------------------------------------------------------");

    }
}