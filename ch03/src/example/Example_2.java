package example;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        int inch;
        double cm;
        final double CM_PER_INCH = 2.54; // Create a constant to avoid magic number
        Scanner in = new Scanner(System.in);

        System.out.print("How many inches? ");
        inch = in.nextInt();
        cm = inch * CM_PER_INCH;

        System.out.printf("%d in = %f cm\n", inch, cm);
    }
}
