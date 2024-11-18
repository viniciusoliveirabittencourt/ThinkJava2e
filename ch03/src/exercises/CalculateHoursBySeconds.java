package exercises;

import java.util.Scanner;

/**
 * A class that get a user input in seconds and output the equivalent in hour:minute:second
 */
public class CalculateHoursBySeconds {
    public static void main(String[] args) {
        int hour, minute, second, totalSecond;
        final int HOUR_OPERATOR = 60;
        Scanner sc = new Scanner(System.in);

        // Input User
        System.out.print("How many seconds have passed since midnight: ");
        totalSecond = sc.nextInt();

        // Calculation
        second = totalSecond % HOUR_OPERATOR;
        hour = (totalSecond - second) / 60; // Total hour in minutes
        minute = hour % HOUR_OPERATOR;
        hour = (hour - minute) / 60;

        // Output Result
        System.out.printf("%d seconds = %d hours, %d minutes and %d seconds", totalSecond, hour, minute, second);
    }
}
