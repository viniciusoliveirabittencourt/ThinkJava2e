package ch02;

public class FloatingPointNumbers {
    public static void main(String[] args) {
        // this is a floating-point numbers, the default floating-point in Java is double
        double pi;
        pi = 3.14159265358979323846;

        // with double, we can solve the minute problem, because Java return a double if some operand are double type
        double minute = 59.0;
        System.out.print("Fraction of the hour that has passed: ");
        System.out.println(minute / 60);

        // Java differentiates 1 and 1.0, in Math are the same, but in Java, one is int and another one is double
        //int x = 1.1; // this is illegal because one is int and another one is double
        double y = 1; // we can do this, because Java transform 1 in 1.0 automatically, but mistakes can happen
        // the normal output will be 0.333, but the output is 0.0, because Java use int result to an int calc and after
            //that, transform it in double
        double z = 1 / 3;
        System.out.println(z);
    }
}
