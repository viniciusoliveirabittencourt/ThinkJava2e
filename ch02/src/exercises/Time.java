package exercises;

public class Time {
    public static void main(String[] args) {
        int hour, minute, second, totalSecond;
        float percentDayPassed;

        hour = 15;
        minute = 4;
        second = 32;
        totalSecond = ((hour * 60) + minute) * 60 + second;
        percentDayPassed = (float) (totalSecond * 100) / 86400;

        System.out.print("Total seconds since midnight: ");
        System.out.println(totalSecond);

        System.out.print("Percentage of day passed: ");
        System.out.println(percentDayPassed + "%");
    }
}
