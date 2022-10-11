package labs_examples.generics.experiments;

public class MyGeneric<T> {
    T val;

    public MyGeneric(T val) {
        this.val = val;
    }

    public void print() {
        System.out.println(val);
    }
}
