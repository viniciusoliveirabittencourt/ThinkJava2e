package examples;

import java.util.Scanner;

/**
 * Demonstrates input validation using if statements.
 */
public class Example_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // Check the format
        if (!sc.hasNextDouble()) {
            String word = sc.next();
            System.err.println(word + " is not a number");
            return;
        }

        // Check the range
        double x = sc.nextDouble();
        if (x > 0) {
            double y = Math.log(x);
            System.out.println("The log is " + y);
        } else {
            System.out.println("The log is undefined");
        }
    }
}
