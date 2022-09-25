package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackJackController {
    public static void main(String[] args) {

        String BLACK_TEXT = "\u001B[30m";
        String WHITE_BACKGROUND = "\u001B[47m";
        String STANDARD_FORMAT = "\u001B[0m";

        Deck deck = new Deck();
        Player player = new Player();
        Player computerAI = new Player();

        boolean continuePlaying = true;

        System.out.println(
                BLACK_TEXT + WHITE_BACKGROUND +
                " -- Welcome to Black Jack -- "
                + STANDARD_FORMAT
        );

        System.out.println("Enter your name: ");

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
            System.out.println(
                    "----------------------------------------------------------"
                    + "\nThis is your hand: "

            );

            //System.out.println("This is your hand: ");
            player.getHand().printCardsInHand();
            System.out.println("\nYour score is: " + player.getHand().getHandScore());

            player.dealAdditionalCards(deck, true);
            computerAI.dealAdditionalCards(deck, false);

            System.out.println("Your score is : " + player.getHand().getHandScore());
            player.countWins(player, computerAI, deck);
            System.out.println("Do you want to play again?");
            Scanner scanner2 = new Scanner(System.in);
            String letsPlayAgain = scanner2.next();
            if(letsPlayAgain.equalsIgnoreCase("y")){
                continuePlaying = true;
            } else {
                System.out.println(
                        BLACK_TEXT + WHITE_BACKGROUND +
                                " -- Exiting Black Jack -- "
                                + STANDARD_FORMAT
                );
                continuePlaying = false;
            }
        }
    }

    public static boolean determineWinner(Player player, Player computerAI) {
        boolean playerWins = false;

        if (player.getHand().getHandScore() > 21) {
            System.out.println(
                    "----------------------------------------------------------"
                    + "\nYou went over! Game over");
        } else if (player.getHand().getHandScore() == 21) {
            System.out.println(
                    "----------------------------------------------------------"
                    + "\nBlackJack!"
            );
            System.out.println(
                    "----------------------------------------------------------"
                    + "\nAI score: " + computerAI.getHand().getHandScore());
            playerWins = true;
        } else if (player.getHand().getHandScore() == computerAI.getHand().getHandScore()) {
            System.out.println(
                    "----------------------------------------------------------"
                    + "Tie. You lose :(");
        } else  if (computerAI.getHand().getHandScore() > 21) {
            System.out.println(
                    "----------------------------------------------------------"
                    + "\nYou win, AI went over :)");
            playerWins = true;
        } else if (computerAI.getHand().getHandScore() > player.getHand().getHandScore()){
            System.out.println(
                    "----------------------------------------------------------"
                    + "You lose :(");
        } else {
            System.out.println(
                    "----------------------------------------------------------"
                    + "\nYou win :)");
            playerWins  = true;
        }
        player.adjustPot(playerWins);
        return playerWins;
    }


    public String getPlayerName() {
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        System.out.println("----------------------------------------------------------");
        System.out.println("You entered this name: " + playerName + ".");
        return playerName;

    }
}
