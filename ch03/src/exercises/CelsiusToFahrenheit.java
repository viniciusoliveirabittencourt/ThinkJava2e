package exercises;

import java.util.Scanner;

/**
 * A class that converts user input in Celsius to Fahrenheit and displays
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        final double CONVERSION_MULTIPLICATION = 1.8, CONVERSION_SUM = 32;
        Scanner sc = new Scanner(System.in);

        // Get input user
        System.out.print("Enter a temperature in Celsius: ");
        celsius = sc.nextDouble();
        sc.nextLine(); // Avoid Scanner bug

        // Calculation
        fahrenheit = (celsius * CONVERSION_MULTIPLICATION) + CONVERSION_SUM;

        // Output result
        System.out.printf("%.1f C = %.1f F\n", celsius, fahrenheit);
    }
}
