/**
 * Partner Lab3
 * Description Program to allow for a menu selection of the two methods and an option for exit.
 * @author James Rohr { MenuSelection, RockPaperScissors Game }
 * @author Asma Klai { RandomNumberGenerator Game}
 * @since 3-25-25
 * @param menuSelection
 * @return method chosen
 */

import java.util.Scanner;

public class MenuSelection {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //menu selection here in main with a do while loop
        int menuSelection;
        do {
            System.out.println("Please select a game to play: ");
            System.out.println("To play numberGenerator select option 1: ");
            System.out.println("To play RockPaperScissors select option 2: ");
            System.out.println("To quit please select option 3: ");
            menuSelection = input.nextInt();
            switch (menuSelection) {
                case 1:
                    //randomNumberGenerator(input);
                    break;
                case 2:
                    int i = 0;
                    System.out.println("Welcome to the game RockPaperScissors!");
                    System.out.println("Please enter your choice: ");
                    System.out.println("Enter 1 for Paper. ");
                    System.out.println("Enter 2 for Scissors. ");
                    System.out.println("Enter 3 for Rock. ");
                    Scanner choice = new Scanner(System.in);
                    i = choice.nextInt();
                    if (i == 1){
                        System.out.println("You have chosen Paper! ");
                    }else if (i == 2) {
                        System.out.println("You have chosen Scissors!");
                    }else if (i == 3) {
                        System.out.println("You have chosen Rock!");
                    }
                    rockPaper.rockPaperScissors(i);
                    break;
                case 3:
                    System.out.println("The program will now exit, have a great day!");
                    break;
                default:
                    System.out.println("Please enter a valid selection.");
                    break;
            }
        } while (menuSelection != 3);
        input.close(); //Close scanner since program is finished
    }
}
