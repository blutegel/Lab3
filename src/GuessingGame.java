/**Description Guessing game that lets you have 5 chances to choose the random number
 * @author Asma Klai
 * @since 3-25-25
 * @returns the winner of the method
 */

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    /**Description game of random numbers giving 5 choices to select the correct number
     * @author Asma Klai
     * @param scanner
     */
    public static void playGuessingGame(Scanner scanner) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int tries = 5;

        System.out.println("I'm thinking of a number between 1 and 100.");

        while (tries > 0) {
            System.out.print("Guess the number (" + tries + " tries left): ");
            int guess = scanner.nextInt();

            if (guess == number) {
                System.out.println("You got it!");
                return;
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
            tries--;
        }

        System.out.println("You lost! The number was " + number);
    }
}
