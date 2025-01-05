package exercises;

import javax.xml.transform.Source;

public class Recursive {
    /**
     * Returns the first character of the given String.
     */
    public static char first(String s) {
        return s.charAt(0);
    }
    /**
     * Returns all but the first letter of the given String.
     */
    public static String rest(String s) {
        return s.substring(1);
    }
    /**
     * Returns all but the first and last letter of the String.
     */
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }
    /**
     * Returns the length of the given String.
     */
    public static int length(String s) {
        return s.length();
    }

    public static boolean isPalindrome(String str) {
        if (length(str) <= 1) {
            return true;
        }

        char init = first(str);
        char last = first(reverseString(str));

        if (init == last) {
            return isPalindrome(middle(str));
        } else {
            return false;
        }
    }

    public static String reverseString(String str) {
        if (length(str) == 0) {
            return "";
        }

        char c = first(str);

        return reverseString(rest(str)) + c;
    }

    public static void printBackward(String str) {
        if (length(str) >= 1) {
            String rest = rest(str);
            printBackward(rest);

            System.out.println(first(str));
        }
    }

    public static void printString(String str) {
        if (length(str) != 0) {
            char print = first(str);
            System.out.println(print);
            printString(rest(str));
        }
    }

    public static void main(String[] args) {
        /**
         * Test methods
         */

        char fisrtChar = first("Ola");
        System.out.println(fisrtChar == 'O');

        String rest = rest("Ola");
        System.out.println(rest.equals("la"));

        String middle = middle("Abacadabra");
        System.out.println(middle.equals("bacadabr"));

        int length = length("Ola");
        System.out.println(length == 3);


        /**
         * Exercises
         */

        printString("Ola");
        printBackward("Ola Vinicius");
        System.out.println(reverseString("Vinicius Oliveira"));
        System.out.println(isPalindrome("palindromeemordnilap"));
    }
}
