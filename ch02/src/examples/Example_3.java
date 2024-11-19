package examples;

public class Example_3 {
    public static void main(String[] args) {
        int hour = 11;
        int minute = 59;

        System.out.print("Number of minutes since midnight: ");
        System.out.println(hour * 60 + minute);

        System.out.print("Fraction of the hour that has passed: ");
        // System.out.println(minute / 60); result: 0 because int / int it will result the int part
        System.out.println(minute * 100 / 60);
    }
}
