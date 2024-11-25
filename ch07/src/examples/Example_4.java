package examples;

import java.util.Random;

public class Example_4 {
    public static int[] randomArrays(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    public static void main(String[] args) {

    }
}
