package exercises;

import java.util.Scanner;

/**
 * A program that puts Fermat's theorem to the test with any user input.
 */
public class FermatTheorem {
    /**
     * End program if Fermat was right.
     */
    public static void fermatWasRight() {
        System.out.println("No, that doesn't work");
        System.exit(1);
    }

    /**
     * End program if Fermat was wrong.
     * This part of the code will never be accessed
     */
    public static void fermatWasWrong() {
        System.out.println("Holy smokes, Fermat was wrong!");
        System.exit(0);
    }

    /**
     * Verify if the input users are integers.
     * @return int
     */
    public static int verifyUserInput() {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextDouble()) {
            System.out.println("Only works with integers");
            fermatWasRight();
        }

        return (int) sc.nextDouble();
    }

    /**
     * Verify if n is bigger them 2
     * @param n The n param - int
     */
    public static void verifyN(int n) {
        if (n <= 2) {
            fermatWasRight();
        }
    }

    public static void main(String[] args) {
        int a, b, c, n, a_b_sum;

        // Welcome and explain Fermat Theorem
        System.out.println("Welcome to Fermat's Last Theorem test!");
        System.out.println("Fermat's Last Theorem says that there are no four integers such that:");
        System.out.println("\ta^n + b^n = c^n");
        System.out.println("except when n <= 2.\n");

        // Get input user
        System.out.print("'A' value: ");
        a = verifyUserInput();

        System.out.print("'B' value: ");
        b = verifyUserInput();

        System.out.print("'C' value: ");
        c = verifyUserInput();

        System.out.print("'N' value: ");
        n = verifyUserInput();
        verifyN(n);

        // Display the formula that will be tested
        System.out.printf("\n%d^%d + %d^%d = %d^%d\n", a, n, b, n, c, n);

        // Calculation
        a = (int) Math.pow(a, n);
        b = (int) Math.pow(b, n);
        c = (int) Math.pow(c, n);
        a_b_sum = a + b;

        // Display the formula after evaluation
        System.out.printf("%d + %d = %d\n", a, b, c);
        System.out.printf("%d = %d\n", a_b_sum, c);

        // Verify the theorem
        if (a_b_sum == c) {
            fermatWasWrong();
        } else {
            fermatWasRight();
        }
    }
}
