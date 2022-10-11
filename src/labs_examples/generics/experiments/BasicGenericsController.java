package labs_examples.generics.experiments;

public class BasicGenericsController {
    public static void main(String[] args) {

        // Step 1) Create an object of the Generic class below and call the print()

        MyGeneric<String> strGeneric = new MyGeneric("Hello");
        strGeneric.print();

        // Step 2) Create another object of the Generic class below using a different
        // data type and call the print() method on it
        MyGeneric<Integer> intGeneric = new MyGeneric(200);
        intGeneric.print();

        // Step 3) modify the class below to require two generic types - then modify
        // your objects above so it still works
        MyGenericTwoTypes<String, Integer> strIntGeneric = new MyGenericTwoTypes<String, Integer>("World", 300);
        strIntGeneric.print();

        String[] arrayVariable = {"Hello", "World"};
        MyGenericArray<String[]> strArrayGeneric = new MyGenericArray(arrayVariable);
        strArrayGeneric.printArray();

        Integer[] intVariable = {200, 400};
        MyGenericArray<String[]> intArrayGeneric = new MyGenericArray(intVariable);
        strArrayGeneric.printArray();

        MyGenericArrayCodingChallenge<String> strCodingChallenge = new MyGenericArrayCodingChallenge();
        strCodingChallenge.printArray(arrayVariable);
    }
}
