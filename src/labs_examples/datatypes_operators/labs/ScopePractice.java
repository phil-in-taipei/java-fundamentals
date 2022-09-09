package labs_examples.datatypes_operators.labs;

public class ScopePractice {
    int val = 123;

    public static void main(String[] args) {

    }
    public void methodOne(){

        val = 234;
        if (val < 500){
            val = 0;
            System.out.println(val);
        } else {
            System.out.println(val);
        }
    }
}
