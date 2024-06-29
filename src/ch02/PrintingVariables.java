package ch02;

public class PrintingVariables {
    public static void main(String[] args) {
        String firstLine = "Hello, again";
        System.out.println(firstLine);
        System.out.print("The value of firstLine: ");
        System.out.println(firstLine);

        int hour = 11;
        int minute = 59;
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");
        // in some computers the prints will only appear together with a println, so never forget a println at end of a output block
    }
}
