package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;

public class Deck {
    //Card[] cards;
    //ArrayList<Integer> usedCards;

    private Card[] deck = new Card[52];

    private ArrayList<Integer> usedCards = new ArrayList();

    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    // static variable to track the number of fresh decks loaded (aka # of games played)
    private static int freshDecksLoaded;
}
