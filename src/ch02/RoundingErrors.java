package ch02;

public class RoundingErrors {
    public static void main(String[] args) {
        // on math, this two equations will be equals, but in talking about binary, 0.1 is a repeating fraction
            //so its floating-point representation in binary is only approximate
            //appearing errors and not being reliable to use them to exactly numbers
        System.out.println(0.1 * 10);
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);

        // with we talk about a little differences that can be disregarded, we should use floating-point
            //but talking about things that need to be exactly, we need to use int, even if are a floating-point
        double myMoneyDouble = 55.59;
        int myMoneyInt = 5559;
        // the first one, is the money in normal way, and the bellow is the money in the correct way to make calculus in every programming language
    }
}
