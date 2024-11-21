package exercises;

import java.util.Scanner;

public class Gauss {
    public static double myPow(double num, int expo) {
        double returnStatment = num;

        for (int i = expo; i > 1; i--) {
            returnStatment *= num;
        }

        return returnStatment;
    }

    public static long myFactorial(int num) {
        for (int i = (num - 1); i > 0; i--) {
            num *= i;
        }

        return num;
    }

    public static double gauss(double x, int n) {
        double firstTherm, secondTherm, result = 0;
        long thirdTherm;

        if (n == 0) {
            return 1;
        }

        for (int i = n; i > 0; i--) {
            firstTherm = myPow(-1, n);
            secondTherm = myPow(x, (n * 2));
            thirdTherm = myFactorial(n);

            result += (firstTherm * secondTherm) / thirdTherm;
        }

        return result;
    }

    /**
     * Valid user input, only can receive numbers, if not, end the system
     * @return A double
     */
    public static double verifyDouble() {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextDouble()) {
            System.out.println("Only numbers are accepted.");
            System.exit(1);
        }

        return sc.nextDouble();
    }

    /**
     * Valid user input, only can receive naturals, if not, end the system
     * @return A natural
     */
    public static int verifyInt() {
        int n;
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("Only natural numbers are accepted.");
            System.exit(1);
        }

        n = sc.nextInt();

        if (n < 0) {
            System.out.println("Only natural numbers are accepted.");
            System.exit(1);
        }

        return n;
    }

    public static void main(String[] args) {
        double x;
        int n;

        System.out.println("Let's calculate exp(-x²)");
        System.out.println("We will use the formula: ((-1)^n * x^n*2)/n!");
        System.out.print("Tell me x: ");
        x = verifyDouble();

        System.out.print("Tell me n: ");
        n = verifyInt();

        // Output result
        System.out.print("Your number is approximately: ");
        System.out.println(gauss(x, n));
    }
}
