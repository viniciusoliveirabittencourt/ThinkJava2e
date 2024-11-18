package exercises;

/**
 * A class how display a date in American and European format.
 */
public class Date {
    /**
     * Method to display American format.
     * @param date Name of the day of the week - String
     * @param month Name of the month - String
     * @param day Number of the day of the month - int
     * @param year Number of the year - int
     */
    public static void printAmerican(String date, String month, int day, int year) {
        System.out.print("American format: ");
        System.out.printf("%s, %s %d, %d\n", date, month, day, year);
    }

    /**
     * Method to display European format.
     * @param date Name of the day of the week - String
     * @param month Name of the month - String
     * @param day Number of the day of the month - int
     * @param year Number of the year - int
     */
    public static void printEuropean(String date, String month, int day, int year) {
        System.out.print("European format: ");
        System.out.printf("%s %d %s %d\n", date, day, month, year);
    }

    public static void main(String[] args) {
        int day = 22, year = 2019;
        String date = "Monday", month = "July";

        printAmerican(date, month, day, year);
        printEuropean(date, month, day, year);
    }
}
