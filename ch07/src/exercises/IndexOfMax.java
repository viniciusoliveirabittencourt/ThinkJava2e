package exercises;

import java.util.Arrays;
import java.util.Random;

public class IndexOfMax {
    public static double[] randomArrays(int size) {
        Random random = new Random();
        double[] a = new double[size];
        for (int i = 0; i < size; i++) {
            a[i] = random.nextDouble(100);
        }
        return a;
    }

    public static int idexOfMax(double[] arr) {
        int index = 0;

        // No, wihout auxiliar methods it's impossible to create an index max search with enchanced for loop
        for (int i = 1; i < arr.length; i++) {
            if (arr[index] < arr[i]) {
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        double[] myArr = randomArrays(100);
        int indexMax = idexOfMax(myArr);

        System.out.println(Arrays.toString(myArr));
        System.out.println(indexMax);
        System.out.println(myArr[indexMax]);
    }
}
