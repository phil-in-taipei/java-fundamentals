package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackJackController {
    public static void main(String[] args) {

        Deck deck = new Deck();
        Player player = new Player();
        Player computerAI = new Player();

        boolean continuePlaying = true;

        System.out.println(
                "Welcome to Black Jack!!!");

        System.out.println("\nEnter your name: ");

        BlackJackController controller = new BlackJackController();
        String name = controller.getPlayerName();
        player.setName(name);

        while(continuePlaying) {
            deck.countGames();

            player.placeBet();

            deck.usedCards.clear();
            player.hand.cards.clear();
            computerAI.hand.cards.clear();

            deck.dealCard(player);
            deck.dealCard(computerAI);
            deck.dealCard(player);
            deck.dealCard(computerAI);

            System.out.println("This is your: ");
            player.getHand().print();
            System.out.println("\nYour score is: " + player.getHand().handScore());

            player.dealAdditionalCards(deck, true);
            computerAI.dealAdditionalCards(deck, false);

            System.out.println("Your score is : " + player.getHand().handScore());
            player.countWins(player, computerAI, deck);
            System.out.println("Do you want to play again?");
            Scanner scanner2 = new Scanner(System.in);
            String letsPlayAgain = scanner2.next();
            if(letsPlayAgain.equalsIgnoreCase("y")){
                continuePlaying = true;
            } else {
                continuePlaying = false;
            }
        }
    }

    public static boolean determineWinner(Player player, Player computerAI) {
        boolean playerWins = false;

        if (player.getHand().handScore() > 21) {
            System.out.println("You went over! Game over");
        } else if (player.getHand().handScore() == 21) {
            System.out.println("BlackJack!");
            System.out.println("AI score: " + computerAI.getHand().handScore());
            playerWins = true;
        } else if (player.getHand().handScore() == computerAI.getHand().handScore()) {
            System.out.println("Tie. You lose :(");
        } else  if (computerAI.getHand().handScore() > 21) {
            System.out.println("You win, AI went over :)");
            playerWins = true;
        } else if (computerAI.getHand().handScore() > player.getHand().handScore()){
            System.out.println("You lose :(");
        } else {
            System.out.println( "You win :)");
            playerWins  = true;
        }
        player.adjustPot(playerWins);
        return playerWins;
    }


    public String getPlayerName() {
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        System.out.println("\nYou entered this name: " + playerName + ".");
        return playerName;

    }
}
