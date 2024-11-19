package exercises;

import java.util.Random;
import java.util.Scanner;

/**
 * A game where the user has to guess the random number.
 * <p>
 * The game will generate a random number, which the user
 * will have 3 chances to guess while the game gives tips on
 * how far away the user is, which can be from more to less.
 */
public class GuessMyNumber {
    /**
     * Generate random number.
     * @return the random number - int
     */
    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1; // Range 1 to 100
    }

    /**
     * Verify the input user to see if are a number.
     * Case is not a number, will finish the program.
     * Case is a different type from integer, will transform the number in integer.
     * @return Return the input user in integer value - int
     */
    public static int verifyInput() {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextDouble()) {
            String word = sc.next();
            System.out.println(word + " is not a number!");
            System.exit(1);
        }

        return (int) sc.nextDouble();
    }

    /**
     * Checks if the user got the number right.
     * If got, it will congratulate and will return a true to close the program.
     * If not, it will show the attempted number and how far are from the right one.
     * @param userGuess The user number guess - int
     * @param realNumber The real number - int
     * @return true - false
     */
    public static boolean verifyGuess(int userGuess, int realNumber) {
        if (userGuess == realNumber) {
            System.out.println("Congrats, you guess the number!");
            return true;
        } else {
            System.out.println("Your number is: " + userGuess);
            System.out.println("You were off by: " + Math.abs(userGuess - realNumber));
            return false;
        }
    }

    public static void main(String[] args) {
        int userGuess, realNumber, attempts;

        // Variable Assignment
        realNumber = randomNumber();
        attempts = 3;

        // Output initial message
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");

        // User input
        System.out.print("Type a number: ");
        userGuess = verifyInput();

        // Give the three chances and verify if the result is equal. If is, close the program.
        if (verifyGuess(userGuess, realNumber)) {
            return;
        } else {
            attempts -= 1;
            System.out.println("You only have " + attempts + " attempts.\n");

            System.out.print("Type a number: ");
            userGuess = verifyInput();

            if (verifyGuess(userGuess, realNumber)) {
                return;
            } else {
                attempts -= 1;
                System.out.println("You only have " + attempts + " attempts.\n");

                System.out.print("Type a number: ");
                userGuess = verifyInput();

                if (verifyGuess(userGuess, realNumber)) {
                    return;
                } else {
                    System.out.println("\nYou have no more attempts!");
                    System.out.println("Your last number was: " + userGuess);
                    System.out.println("The number I was thinking of is: " + realNumber);
                }
            }
        }
    }
}
