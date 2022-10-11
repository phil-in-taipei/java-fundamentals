package labs_examples.generics.experiments;

import java.util.Arrays;

public class MyGenericArray<T> {
    T val[];

    public MyGenericArray(T val[]) {
        this.val = val;
    }

    public void printArray() {
        //System.out.println(Arrays.toString(val));
        for (int i=0; i < val.length; i++) {
            System.out.println(val[i]);
        }
    }
}
