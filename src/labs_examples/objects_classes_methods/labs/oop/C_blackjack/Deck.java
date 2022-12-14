package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.*;

public class Deck {

    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards = new ArrayList<>();
    char[] suit = {'♠', '♦', '♥', '♣'};
    int[] cardValue = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    public static int countNewGame = 0;

    public Deck() {
        populateDeck();
    }

    public void countGames(){
        countNewGame++;
        System.out.println("This is game number: " + countNewGame);
    }
    public void populateDeck() {

        int counter = 0;

        for (int i = 0; i < suit.length; i++) {

            for (int j = 0; j < cardValue.length; j++) {
                char theSuit = suit[i];
                int theCardValue = cardValue[j];
                cards[counter] = new Card(theSuit, theCardValue);
                counter++;

            }
        }
    }

    public void dealCard(Player player) {

        Random rand = new Random();
        int cardIndex;
        do {
            cardIndex = rand.nextInt(cards.length);
        } while (usedCards.contains(cardIndex));
        usedCards.add(cardIndex);

        Card cardDrawn = cards[cardIndex];
        player.getHand().getCards().add(cardDrawn);
    }

    public void playNewGame(Player player, Player computerAI){
        usedCards.clear();
        player.getHand().getCards().clear();
        computerAI.getHand().getCards().clear();
        dealCard(player);
    }

    private boolean ifCardUsed(int value) {
        if(usedCards.contains(value)){
            return true;
        } else {
            return false;
        }
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }


    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                ", usedCards=" + usedCards +
                ", suit=" + Arrays.toString(suit) +
                ", cardValue=" + Arrays.toString(cardValue) +
                '}';
    }
}

