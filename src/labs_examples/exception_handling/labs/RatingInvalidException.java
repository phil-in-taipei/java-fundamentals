package labs_examples.exception_handling.labs;

public class RatingInvalidException extends Exception {

    @Override
     public String toString() {
        return "The rating must be between 0 and 5!";
    }
}
