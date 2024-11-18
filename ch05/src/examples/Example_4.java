package examples;

public class Example_4 {
    public static void main(String[] args) {
        int x = 5;
        boolean evenFlag = (x % 2 == 0), positiveFlag = (x > 0);

        if (evenFlag) {
            System.out.println("n was even when I checked it");
        }

        if (!evenFlag) {
            System.out.println("n was oden when I checked it");
        }
    }
}
