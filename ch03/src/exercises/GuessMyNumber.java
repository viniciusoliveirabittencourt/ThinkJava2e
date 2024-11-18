package exercises;

import java.util.Random;
import java.util.Scanner;

/**
 * A guess number game.
 */
public class GuessMyNumber {
    public static void main(String[] args) {
        int userGuess, realNumber;
        final int RAND_RANGE = 100, INCREMENT_RANGE = 1;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        realNumber = random.nextInt(RAND_RANGE) + INCREMENT_RANGE;

        // Output initial message
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");

        // User input
        System.out.print("Type a number: ");
        userGuess = sc.nextInt();

        // Output result
        System.out.println("Your number is: " + userGuess);
        System.out.println("The number I was thinking of is: " + realNumber);
        System.out.println("You were off by: " + Math.abs(userGuess - realNumber));
    }
}
