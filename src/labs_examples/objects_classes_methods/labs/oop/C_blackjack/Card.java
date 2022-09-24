package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    //char[] suit;//  = new char[]{'♠', '♦', '♥', '♣'};
    private char suit;
    private int scoreValue;

    private String value;

    public Card(char suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String customToString() {
        return suit + value + suit;
    }

    public int getScoreValue() {

        // try to return the face value - this will work for cards 2-10
        try {
            return Integer.valueOf(value);
        } catch (Exception e){
            // if the try statement fails
            // check to see if the cards is an ACE
            if (value.equalsIgnoreCase("ACE")){
                // if so, return 11
                return 11;
            } else {
                // otherwise it must be a Jack, Queen or King, return 10
                return 10;
            }
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", value='" + value + '\'' +
                ", scoreValue=" + scoreValue +
                '}';
    }
}

