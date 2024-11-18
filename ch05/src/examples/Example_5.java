package examples;

public class Example_5 {
    public static boolean isSingleDigitDumb(int x) {
        if (x > -10 && x < 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSingleDigit(int x) {
        return x > -10 && x < 10;
    }

    public static void main(String[] args) {
        int x = 5;
        boolean bigFlag = !isSingleDigit(17);

        System.out.println(bigFlag);
        System.out.println(isSingleDigitDumb(x));
        System.out.println(isSingleDigit(x));

        if (isSingleDigit(x)) {
            System.out.println("x is small");
        } else {
            System.out.println("x is big");
        }
    }
}
