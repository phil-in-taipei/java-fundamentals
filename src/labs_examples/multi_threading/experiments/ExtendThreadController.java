package labs_examples.multi_threading.experiments;

public class ExtendThreadController {
    public static void main(String args[]) {
        System.out.println("** Main Thread Start **");
        MyFirstThread thread1 = new MyFirstThread("First Thread");
        MyFirstThread thread2 = new MyFirstThread("Second Thread");
        MyFirstThread thread3 = new MyFirstThread("Third Thread");
        // notice when the next line prints
        System.out.println("** Main Thread End **");
    }
}
