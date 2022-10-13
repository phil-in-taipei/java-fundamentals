package labs_examples.generics.labs;

public class GenericWithTwoVariables<T, U> {
    T variable1;
    U variable2;

    public GenericWithTwoVariables(T variable1, U variable2) {
        this.variable1 = variable1;
        this.variable2 = variable2;
    }

    public void setVariable1(T variable1) {
        this.variable1 = variable1;
    }

    public void setVariable2(U variable2) {
        this.variable2 = variable2;
    }

    @Override
    public String toString() {
        return "GenericWithTwoVariables {" +
                "\n variable1 = " + variable1 + ","
                + "\n variable2 = " + variable2 +
                "\n}";
    }

    public T getVariable1() {
        return variable1;
    }

    public U getVariable2() {
        return variable2;
    }
}
