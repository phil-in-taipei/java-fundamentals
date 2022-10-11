package labs_examples.generics.experiments;

public class MyGenericArrayCodingChallenge<T> {
    public void printArray(T[] array){
        for(T elem: array){
            System.out.println(elem);
        }
    }
}
