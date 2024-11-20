package examples;

public class Example_2 {
    public static void main(String[] args) {
        int i = 2;

        while (i <= 8) {
            System.out.print(i + ", ");
            i += 2;
        }
        System.out.println("Who you appreciate?");

        for (i = 2; i <= 8; i += 2) {
            System.out.print(i + ", ");
        }
        System.out.println("Who you appreciate?");
    }
}
