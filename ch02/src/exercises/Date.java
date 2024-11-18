package exercises;

public class Date {
    public static void main(String[] args) {
        int day, year;
        String date, month;

        day = 18;
        year = 2024;
        date = "Monday";
        month = "November";

        System.out.print("American format: ");
        System.out.println(date + ", " + month + " " + day + ", " + year);

        System.out.print("European format: ");
        System.out.println(date + " " + day + " " + month + " " + year);
    }
}
