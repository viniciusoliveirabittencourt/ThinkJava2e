package ch02;

public class Time {
    public static void main(String[] args) {
        int hour, minute, second, secondsADay;

        hour = 20;
        minute = 48;
        second = 22;
        secondsADay = 86400;

        int daySeconds = (hour * 60 * 60) + (minute * 60) + second;
        System.out.println("The seconds from midnight until now, is: " + daySeconds);

        int secondsToEndDay = secondsADay - daySeconds;
        System.out.println("The seconds to end day is: " + secondsToEndDay);

        int percentDayPassed = (daySeconds * 100) / secondsADay;
        System.out.println("The percent of the day that has passed is: " + percentDayPassed + "%");

        hour = 21;
        minute = 7;
        second = 26;

        int passedTime = ((hour * 60 * 60) + (minute * 60) + second) - daySeconds;
        System.out.println(passedTime + " seconds have passed since I start the exercise");
    }
}
