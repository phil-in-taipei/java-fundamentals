package labs_examples.generics.experiments;

public class MyGenericTwoTypes<T, U> {
    T val1;
    U val2;

    MyGenericTwoTypes(T val1, U val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public void print() {
        System.out.println(val1);
        System.out.println(val2);
    }
}
