package examples;

import java.util.Arrays;

public class Example_1 {
    public static void printArray(int[] a) {
        System.out.print("{ " + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }
    public static void main(String[] args) {
        int[] counts = new int[4];
        int[] a = {1, 2, 3, 4};

        System.out.println("The zeroth element is " + counts[0]);

        counts[0] = 7;
        counts[1] = counts[0] * 2;
        counts[2]++;
        counts[3] -= 60;

        for (int i = 0; i < 4; i++) {
            System.out.println(counts[i]);
        }

        printArray(a);
        System.out.println(Arrays.toString(a));
    }
}
