package labs_examples.generics.labs;

import java.util.ArrayList;

public class GenericArrayList {

    public static double sumOfNumbersInArray(ArrayList<? extends Number> nums) {
        double sum = 0;
        for (int i=0; i< nums.size(); i++) {
            sum += (double) nums.get(i).doubleValue();
        }
        return sum;
    }
}
