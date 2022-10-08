package labs_examples.multi_threading.experiments;

public class ExampleController {
    public static void main(String[] args) {
        System.out.println("** Main Thread Start **");
        MyFirstRunnable threadTest = new MyFirstRunnable("MyFirstRunnable");
        MyFirstRunnable threadTest2 = new MyFirstRunnable("MySecondRunnable");
        MyFirstRunnable threadTest3 = new MyFirstRunnable("MyThirdRunnable");
        System.out.println("** Main Thread End **");
    }
}
