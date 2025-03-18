/**
 * Partner Lab3
 * Description Program to allow for a menu selection of the two methods and an option for exit.
 * @author James Rohr
 * @since 3-18-25
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
            System.out.println("Please select an option: ");
            menuSelection = input.nextInt();
            switch (menuSelection) {
                case 1:
                    randomNumberGenerator(input);
                    break;
                case 2:
                    rockPaperScissors(input);
                    break;
                case 3:
                    //Close selection
                    break;
                default:
                    System.out.println("Please enter a valid selection.");
                    break;
            }
        } while (menuSelection != 3);
        input.close(); //Close scanner since program is finished
    }
}
