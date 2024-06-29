package ch02;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int hour = 11;
        int minute = 59;
        System.out.print("Number of minute since midnight: ");
        // this one are an expression
        // when the computer will value the expression, it will get the real values, so hour became 60 and minute became 59
        // the values on expression, are called operands
        System.out.println(hour * 60 + minute);

        System.out.print("Fraction of the hour that has passed: ");
        // the normal result may be 0.98333, but the result is 0, that's because Java transform the calculus of two integer in integer too
        System.out.println(minute / 60);

        System.out.print("Fraction of the hour that has passed: ");
        // we can calc the percentage rather
        System.out.println(minute * 100 / 60);
    }
}
