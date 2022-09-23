package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer:
 * The type is A, so it takes the standard A variable value of 10
 * (if it is initialized declared as "B a = new B();", the value will be 20)
 *
 */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();
        //B a = new B();

        System.out.println(a.i);
    }
}