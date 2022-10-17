package labs_examples.lambdas.experiments;

interface AnonymousInner {
    public void methodOne();

    public int methodTwo(int a);
}
public class AnonymousExperiment {
    public static void main(String[] args) {
        AnonymousInner obj = new AnonymousInner() {
            @Override
            public void methodOne() {
                System.out.println("Hello from method one");
            }

            @Override
            public int methodTwo(int a) {
                return a;
            }
        };

        int intFromMethod = obj.methodTwo(5);

        obj.methodOne();

        System.out.println("This is the integer passed into method two: " + intFromMethod);




    }

}
