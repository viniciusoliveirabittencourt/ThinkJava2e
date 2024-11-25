package examples;

import java.util.Arrays;
import java.util.Random;

public class Examples_5 {
    public static int[] randomArrays(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    public static int inRange(int[] a, int low, int high) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] < high) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] scores = randomArrays(30);
        System.out.println(Arrays.toString(scores));
        int[] counts = new int[100];
        /*
        for (int i = 0; i < scores.length; i++) {
            int index = scores[i];
            counts[index]++;
        }
         */
        for (int score : scores) {
            counts[score]++;
        }

        System.out.println(Arrays.toString(counts));
    }
}
