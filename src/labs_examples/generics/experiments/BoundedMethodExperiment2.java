package labs_examples.generics.experiments;

public class BoundedMethodExperiment2 {
    public static void main(String[] args) {

        // this can get the max value of numbers or strings
        System.out.println(getMax(100, 20, 30));

        System.out.println(getMax("hello", "hurray", "la"));
    }

    public static <T extends Comparable<T>> T getMax(T x, T y, T z) {
        T max = x;   // assume x is initially the largest

        if(y.compareTo(max) > 0) {
            max = y;   // y is the largest so far
        }

        if(z.compareTo(max) > 0) {
            max = z;   // z is the largest now
        }
        return max;   // returns the largest object
    }
}
