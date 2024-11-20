package examples;

public class Example_1 {
    public static void main(String[] args) {
        int n = 3, i = 1;
        while (n > 0) {
            System.out.println(n);
            n -= 1;
        }
        System.out.println("Blastoff!");

        n = 3;
        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }

        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}
