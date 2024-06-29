package ch02;

public class Date {
    public static void main(String[] args) {
        String day = "Saturday";
        String month = "Jun";
        int date = 29;
        int year = 2024;

        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
        System.out.println("European format: " + day + ", " + date + " " + month + ", " + year);
    }
}
