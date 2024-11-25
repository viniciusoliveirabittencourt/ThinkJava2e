package examples;

import java.util.Arrays;

public class Example_3 {
    public static int search(int[] arr, double target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
    public static double sum(double[] arr) {
        double total = 0.0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        return total;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        double[] array = {3.14, -55.0, 1.23, -0.8};
        for (int i = 0; i < a.length; i++) {
            a[i] *= a[i];
        }

        System.out.println(Arrays.toString(a));
        System.out.println(search(a, 9));
        System.out.println(search(a, 77));
        System.out.println(sum(array));
    }
}
