package exercises;

import java.util.Scanner;

public class SquareRoot {
    /**
     * Calculate the approximately by the formula x1 = (x0 + a/x0)/2
     * @param a The number to calculate the root - double
     * @return The root of the number - double
     */
    public static double squareRoot(double a) {
        double x0, x1;
        x0 = a / 2;
        x1 = (x0 + a / x0) / 2;

        while ((x0 - x1) >= 0.0001) {
            x0 = x1;
            x1 = (x0 + a / x0) / 2;
        }

        return x1;
    }
    /**
     * Valid user input, only can receive numbers, if not, end the system
     * @return A positive double
     */
    public static double verifyUserInput() {
        double inputUser;
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextDouble()) {
            System.out.println("Only positive numbers are accepted.");
            System.exit(1);
        }

        inputUser = sc.nextDouble();

        if (inputUser <= 0) {
            System.out.println("Only positive numbers are accepted.");
            System.exit(1);
        }

        return inputUser;
    }

    public static void main(String[] args) {
        double userNumber;

        // Input user
        System.out.print("Let's calculate the square root of: ");
        userNumber = verifyUserInput();

        // Output result
        System.out.print("The square root of your number is approximately: ");
        System.out.println(squareRoot(userNumber));
    }
}
