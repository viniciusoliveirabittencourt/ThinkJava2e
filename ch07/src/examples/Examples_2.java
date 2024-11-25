package examples;

import java.util.Arrays;

public class Examples_2 {
    public static void main(String[] args) {
        double[] a = new double[3];
        double[] b = a;
        double[] c = Arrays.copyOf(a, a.length);

        a[0] = 17.0;
        System.out.println(b[0]);
        System.out.println(c[0]);
    }
}
