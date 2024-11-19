package example;

public class PrintTime {
    public static void printTime(int hour, int minute) {
        System.out.printf("%d : %d\n", hour, minute);
    }

    public static void main(String[] args) {
        final int HOUR = 11, MINUTE = 50;
        printTime(HOUR, MINUTE);
    }
}
