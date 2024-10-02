package se.anis.dicegame;

import javax.xml.namespace.QName;
import java.util.Random;
import java.util.Scanner;

public class DiceGame {



    public static void main(String[] args) {

        Player nextPlayer = null;

        Player player1 = null, player2 = null;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean hasPlayerSetupFinish = false;

        int turnsLeft = 2;

        while (true) {
            if (!hasPlayerSetupFinish) {

                System.out.println("Enter player one name: ");
                String player1_name = scanner.nextLine();
                player1 = new Player(player1_name, 0);
                System.out.println("Enter player two names: ");

                String player2_name = scanner.nextLine();
                player2 = new Player(player2_name, 0);

                nextPlayer = player1;

                hasPlayerSetupFinish = true;

            } else {

                String input = scanner.nextLine();

                System.out.println("now roll, "+ turnsLeft);
                if (input.equals("")) {

                    int roll = random.nextInt(6) + 1;
                    nextPlayer.setScore(nextPlayer.getScore() + roll);

                    System.out.println(nextPlayer.getPlayerName() + " du fick " + roll);

                    turnsLeft--;

                    if(turnsLeft == 0) {
                        if (nextPlayer == player1) {
                            nextPlayer = player2;
                        } else {
                            nextPlayer = player1;
                        }
                        nextPlayer.setHasPlayedTurn(true);
                        turnsLeft = 2;

                        if (player1.hasPlayedTurn() && player2.hasPlayedTurn()) {

                            System.out.println("You win!");
                            if (player1.getScore() == player2.getScore()) {
                                System.out.println("Draw!");

                            }else if(player1.getScore() > player2.getScore()) {
                                System.out.println(player1.getPlayerName() + " wins! score: " + player1.getScore());

                            }else {
                                System.out.println(player2.getPlayerName() + " wins! score: " + player2.getScore());

                            }
                            break;
                        }



                    }


                }


            }


        }


    }


}









