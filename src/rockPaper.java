/**
 * Description A method called rockPaperScissors to play the rock paper scissors game.
 * @author James Rohr
 * @param i the int representing the chosen selection
 * @returns will print to the display the winner of the game
 *
 */

import java.util.Scanner;
import java.util.Random;

public class rockPaper {
    public static void rockPaperScissors(int i) {
        Scanner keyboardSelection = new Scanner(System.in);
        while (i == 0)
        i = keyboardSelection.nextInt();

        Random random = new Random();
        int randomGuess = random.nextInt(3) + 1;
        int guesses = 0;
        do {
            System.out.println("Please choose a selection: ");

            if (i == randomGuess) {
                System.out.println("There is a tie!  Please play again!");
                break;
            } else if (i == 3 && randomGuess == 1) {
                System.out.println("Paper beats Rock, the computer wins!");
                guesses++;
            } else if (i == 3 && randomGuess == 2) {
                System.out.println("Rock beats Scissors, you win!");
                guesses++;
            }else if (i == 2 && randomGuess == 1) {
                System.out.println("Scissors beats Paper, you win!");
                guesses++;
            }else if (i == 2 && randomGuess == 3) {
                System.out.println("Rock beats Scissors, the computer wins!");
                guesses++;
            }else if (i == 1 && randomGuess == 3) {
                System.out.println("Paper beats Rock, you win!");
                guesses++;
            }else if (i == 1 && randomGuess == 2) {
                System.out.println("Scissors beats Paper, the computer wins!");
                guesses++;
            }

        }
        while (guesses != 1);
        {
            System.out.println("The game is over, please play again!");
        }

    }
    }


