package exercises;

public class Sieve {
    public static boolean[] sieve(int n) {
        boolean[] booleanPrimes = new boolean[n];

        for (int i = 2; i < booleanPrimes.length; i++) {
            booleanPrimes[i] = true;
        }

        for (int i = 2; i < booleanPrimes.length; i++) {
            for (int j = (i + 1); j < booleanPrimes.length; j++) {
                if (j % i == 0) {
                    booleanPrimes[j] = false;
                }
            }
        }

        return booleanPrimes;
    }

    public static void main(String[] args) {
        boolean[] boo = sieve(25);

        for (int i = 0; i < boo.length; i++) {
            System.out.println(i + " - " + boo[i]);
        }
    }
}
