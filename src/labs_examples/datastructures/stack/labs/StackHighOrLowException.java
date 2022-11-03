package labs_examples.datastructures.stack.labs;

public class StackHighOrLowException extends Exception{
    String errorMessage;
    public StackHighOrLowException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String getMessage() {
        return errorMessage;
    }

}
