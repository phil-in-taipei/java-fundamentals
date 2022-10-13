package labs_examples.generics.experiments;

public class GenericClassWithBoundedTypes<T> {
    private T t;
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
    /* the method below uses bounded types - it is Generic - but only accepts data types that are subclass of "Number" */
    /* if this was not done, the main() method below would fail */
    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
    /* if a non-number was passed to this method it would fail due to the multiplication below */
    public <U extends Number> double square(U u){
        return u.doubleValue() * u.doubleValue();
    }
    public static void main(String[] args) {
        GenericClassWithBoundedTypes<Integer> integerBox = new GenericClassWithBoundedTypes<Integer>();
        integerBox.set(new Integer(10));
        //integerBox.inspect("some text"); // error - inspect() only accepts sublasses of "Number"
    }

}
