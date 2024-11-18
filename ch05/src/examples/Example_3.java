package examples;

public class Example_3 {
    public static void main(String[] args) {
        int x, y;
        x = 1;
        y = 7;

        if (x == 0 && y == 0) {
            System.out.println("Both x and y are zero!");
        }

        if (x == 0 || y == 0) {
            System.out.println("Either x or y is zero!");
        }

        if (!(x == 0 || y == 0)) {
            System.out.println("Neither x nor y is zero!");
        }

        // De Morgan's Laws
        if (x != 0 && y != 0) {
            System.out.println("Neither x nor y is zero!");
        }
    }
}
