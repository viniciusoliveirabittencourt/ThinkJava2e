package examples;

public class Example_5 {
    public static void main(String[] args) {
        System.out.print("Roman alphabet: ");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);
        }
        System.out.println();

        System.out.print("Greek alphabet: ");
        for (int i = 913; i <= 937; i++) {
            System.out.print((char) i);
        }
        System.out.println();

        System.out.print("Curiosity: ");
        for (int i = 0; i <= 30; i++) {
            System.out.print((char) i);
        }
        System.out.println();

        System.out.print("Test: " + (char) 9);
    }
}
