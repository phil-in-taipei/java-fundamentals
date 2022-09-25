package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {


    ArrayList<Card> cards = new ArrayList<>();
    int handValue;

    public int getHandScore() {
        int currentScore = 0;
        for (Card c : cards) {
            currentScore += c.getScoreValue();
        }
        return currentScore;
    }

    public boolean bustedCheck() {

        if (getHandScore() > 21) {
            return true;
        } else {
            return false;
        }
    }

    public Hand() {
    }

    public Hand(int handValue) {
        this.cards = cards;
        this.handValue = handValue;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + cards +
                ", handValue=" + handValue +
                '}';
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

    public void add(Card cardDealt) {
        return;
    }

    public void printCardsInHand() {
        for (Card c : cards) {
            System.out.print(c.printCardInfo() + " ");
        }
    }
}
