package exercises;

public class Multadd {
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        final double exp, sqr;
        exp = Math.exp(-x);
        sqr = Math.sqrt(1 - exp);

        return multadd(x, exp, sqr);
    }

    public static void main(String[] args) {
        double result, sin, cos, log1, log2;
        final double PI_FOUR = Math.PI / 4, MULT_ADD_INUTIL = 1.0;

        result = multadd(1.0, 2.0, 3.0);
        System.out.println(result);

        sin = Math.sin(PI_FOUR);
        cos = Math.cos(PI_FOUR) / 2;
        result = multadd(MULT_ADD_INUTIL, sin, cos);
        System.out.println(result);

        log1 = Math.log(10);
        log2 = Math.log(20);
        result = multadd(MULT_ADD_INUTIL, log1, log2);
        System.out.println(result);

        result = expSum(2);
        System.out.println(result);
    }
}
