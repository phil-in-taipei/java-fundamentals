package labs_examples.exception_handling.labs;

public class CustomExceptionExercise7 {
    public static void main(String[] args) throws RatingInvalidException {
        System.out.println("--------------------------------------------------");

        System.out.println("Custom exception example:");

        System.out.println("--------------------------------------------------");
        System.out.println("**************************************************");
        System.out.println("--------------------------------------------------");
        System.out.println("This will be valid: ");
        submitRating(2);
        System.out.println("--------------------------------------------------");
        System.out.println("This will throw a custom exception: ");
        submitRating(8);
        System.out.println("--------------------------------------------------");
    }

    public static void submitRating(int rating) throws RatingInvalidException {
        if (rating > 0 && rating <=5) {
            System.out.println("The rating is:  " + rating);
        } else {
        // manually throw new custom exception
            throw new RatingInvalidException();
        }
    }
}
