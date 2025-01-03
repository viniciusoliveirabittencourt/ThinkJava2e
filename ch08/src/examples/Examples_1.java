package examples;

public class Examples_1 {
    public static int array11(int[] nums, int index) {
        if (index >= nums.length) {
            return 0;
        }

        if (nums[index] == 11) {
            return 1 + array11(nums, ++index);
        } else {
            return array11(nums, ++index);
        }
    }
    public static String noX(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char c = str.charAt(0);
        String rest = str.substring(1);

        if (c == 'x') {
            return noX(rest);
        } else {
            return c + noX(rest);
        }
    }
    public static void displayBinary(int value) {
        if (value > 0) {
            displayBinary(value / 2);
            System.out.print(value % 2);
        }
    }
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(--n);
    }
    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(--n);
        }
    }
    public static void main(String[] args) {
        /*
        countdown(5);
        System.out.println(factorial(5));
        System.out.println(fibonacci(10));
        displayBinary(23);
         */
        int[] nums = {11, 11, 11, 5};
        System.out.println(noX("xabxxxakjwndaxff"));
        System.out.println(array11(nums, 0));
    }
}
