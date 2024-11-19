package exercises;

import java.util.Scanner;

/**
 * A class that calculates the roots of a user-given quadratic function.
 */
public class Quadratic {
    /**
     * Valid user input, only can receive numbers, if not, end the system
     * @return double
     */
    public static double validNumbers() {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextDouble()) {
            System.out.println("Only numbers are accepted.");
            System.exit(1);
        }

        return sc.nextDouble();
    }

    /**
     * Validates if 'a' is different from 0
     * @param a The 'a'
     */
    public static void validA(double a) {
        if (a == 0) {
            System.out.println("If 'a' equals 0 then it is not a quadratic function");
            System.exit(1);
        }
    }

    /**
     * Baskara sum calculation, with delta is less them 0, output the formula
     * @param a a - double
     * @param b b - double
     * @param delta delta calc - double
     */
    public static void baskaraSum(double a, double b, double delta) {
        System.out.print("x1: ");
        if (delta < 0) {
            System.out.printf("(-%.2f + √%.2f)/%.2f\n", b, delta, 2 * a);
        } else {
            System.out.println((-b + Math.sqrt(delta)) / (2 * a));
        }
    }

    /**
     * Baskara minus calculation, with delta is less them 0, output the formula
     * @param a a - double
     * @param b b - double
     * @param delta delta calc - double
     */
    public static void baskaraMinus(double a, double b, double delta) {
        System.out.print("x2: ");
        if (delta < 0) {
            System.out.printf("(-%.2f - √%.2f)/%.2f\n", b, delta, 2 * a);
        } else {
            System.out.println((-b - Math.sqrt(delta)) / (2 * a));
        }
    }

    public static void main(String[] args) {
        double a, b, c, delta;

        // Program presentation
        System.out.println("A quadratic function has the following form:");
        System.out.println("\tax^2 + bx + c = 0");

        // User input
        System.out.print("'a' value: ");
        a = validNumbers();
        validA(a);

        System.out.print("'b' value: ");
        b = validNumbers();

        System.out.print("'c' value: ");
        c = validNumbers();

        // Display the quadratic function
        System.out.printf("(%.2f)x^2 + (%.2f)x + %.2f = 0\n", a, b, c);

        // Calculation
        delta = Math.pow(b, 2) - 4 * a * c;
        baskaraSum(a, b, delta);
        baskaraMinus(a, b, delta);
    }
}
