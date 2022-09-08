package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        System.out.print("");
        int lenOfHello = str.length();

        System.out.println(
                "The length of the word hello is: ".concat(
                    Integer.toString(lenOfHello)
                ));

        String str2 = "hello";

        // please initialize a boolean variable and test whether str is equal to str2
        // they aren't equal, but their values are the same
        System.out.println("");
        boolean stringsAreEqual = str.equals(str2);
        System.out.println("The two strings are the equal: " + stringsAreEqual);
        System.out.println("");
        System.out.println(
                "The two strings are the same: " + confirmStringsAreSame(str, str2)
        );
        System.out.println("");


        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = str.concat(str2);
        System.out.println(str3);
        String concatShouldBe = "hello!hello";
        System.out.println("");
        System.out.println(
                "This string is a concatenation of the first two strings: " + str3
        );


        System.out.println("");

        // for fun, I called another method, that checks if the strings are the same
        System.out.println(
                "The concatenated string was what I expected: " + confirmStringsAreSame(str3, concatShouldBe)
        );
        System.out.println("");


        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

        // contains example
        boolean stringContainsI = "string".contains("i");
        System.out.println(
                "There's not no 'i' in string: " + stringContainsI
        );

        System.out.println("");

        // replace example
        String hopeMySkills = "string".replace("i", "o");
        System.out.println(
                "I hope my skills will become: " + hopeMySkills
        );
        System.out.println("");

        // substring example
        String codingStandard = "Stringently".substring(0, 9);
        System.out.println("I should apply " + codingStandard + " standards");
        System.out.println("");

        // index example
        int indexOfO = str.indexOf('o');
        System.out.println(
                "The character o is at this index in the word 'hello': " + indexOfO
        );
    }

    public static boolean confirmStringsAreSame(String str1, String str2) {
        // this returns a boolean confirming whether
        // the strings have
        // the same values

        int l1 = str1.length();
        int l2 = str2.length();

        boolean stringLengthsAreSame = l1 == l2;

        boolean stringAreSameTheory = false;

        if (stringLengthsAreSame) {
            stringAreSameTheory = true;
            for (int i = 0; i < l2; i++) {
                char str1_ch = str1.charAt(i);
                char str2_ch = str2.charAt(i);
                if (str1_ch != str2_ch) {
                    stringAreSameTheory = false;
                } else {
                    stringAreSameTheory = true;
                }
            }
        }

        return stringAreSameTheory;
    }
}