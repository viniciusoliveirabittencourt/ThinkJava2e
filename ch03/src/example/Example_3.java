package example;

import java.util.Scanner;

public class Example_3 {
    public static void main(String[] args) {
        int inch;
        double cm;
        final double CM_PER_INCH = 2.54; // Create a constant to avoid magic number
        Scanner in = new Scanner(System.in);

        System.out.print("How many centímeters? ");
        cm = in.nextDouble();
        inch = (int) (cm / CM_PER_INCH);

        System.out.printf("%.0f cm = %d in\n", cm, inch);
    }
}
