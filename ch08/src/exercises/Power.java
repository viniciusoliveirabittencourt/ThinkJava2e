package exercises;

public class Power {
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n % 2 == 0) {
            double halfPower = power(x, n / 2);
            return halfPower * halfPower;
        }

        return x * power(x, --n);
    }
    public static void main(String[] args) {
        System.out.println(power(5, 6));
    }
}
