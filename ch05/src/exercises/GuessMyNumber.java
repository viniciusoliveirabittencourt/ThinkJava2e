package exercises;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1; // Range 1 to 100
    }

    public static int verifyInput() {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextDouble()) {
            String word = sc.next();
            System.out.println(word + " is not a number!");
            System.exit(1);
        }

        return (int) sc.nextDouble();
    }

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
