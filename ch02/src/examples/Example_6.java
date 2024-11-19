package examples;

public class Example_6 {
    public static void main(String[] args) {
        // rounding error
        System.out.println(0.1 * 10);
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);

        // to avoid rounding error when you need absolute precision, like money transaction, its better use int instead of double
        // double balance = 123.45; potencial rounding error
        int balance = 12345; //correct
    }
}
