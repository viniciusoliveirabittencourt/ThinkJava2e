package exercises;

import java.util.Scanner;

/**
 * A class how calc if 3 integers can make a Triangle.
 */
public class Triangle {
    /**
     * Valid user input, only can receive numbers, if not, end the system
     * @return The integer positive part of a double
     */
    public static int validNumbers() {
        int inputUser;
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextDouble()) {
            System.out.println("Only positive integers are accepted.");
            System.exit(1);
        }

        inputUser = (int) sc.nextDouble();

        if (inputUser <= 0) {
            System.out.println("Only positive integers are accepted.");
            System.exit(1);
        }

        return inputUser;
    }
    public static void main(String[] args) {
        int a, b, c, sumAB, sumAC, sumBC;

        // Program presentation
        System.out.println("You think you can make a triangle ?");

        // Input user
        System.out.print("'a' triangle size: ");
        a = validNumbers();

        System.out.print("'b' triangle size: ");
        b = validNumbers();

        System.out.print("'c' triangle size: ");
        c = validNumbers();

        // Calculation
        sumAB = a + b;
        sumAC = a + c;
        sumBC = b + c;

        // Impossible the sum of two positive numbers can be lesser them this two numbers.
        if (sumAB < c) {
            System.out.println("You can't make a triangle.");
            System.out.println("c = " + c);
            System.out.println("a + b = " + sumAB);
            System.out.println("c is bigger them " + sumAB);
        } else if (sumAC < b) {
            System.out.println("You can't make a triangle.");
            System.out.println("b = " + b);
            System.out.println("a + c = " + sumAC);
            System.out.println("b is bigger them " + sumAC);
        } else if (sumBC < a) {
            System.out.println("You can't make a triangle.");
            System.out.println("a = " + a);
            System.out.println("b + c = " + sumBC);
            System.out.println("a is bigger them " + sumBC);
        } else {
            System.out.println("Congratulations you make a triangle.");
        }
    }
}
