package labs_examples.datastructures.queue.labs;

public class QueueHighOrLowException extends Exception{
    String errorMessage;
    public QueueHighOrLowException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String getMessage() {
        return errorMessage;
    }

}
