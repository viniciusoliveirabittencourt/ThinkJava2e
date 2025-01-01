package exercises;

public class ArePrimeFactors {
    public static boolean arePrimeFactors(int n, int[] intArr) {
        boolean isPrimeFactors = true;
        int product = 1;

        for (int i = 0; i < intArr.length; i++) {
            boolean areNotPrime = true;
            product *= intArr[i];

            for (int j = 0; j < intArr.length; j++) {
                if (i == j) {
                    continue;
                }

                if (intArr[j] % intArr[i] == 0) {
                    areNotPrime = false;
                    break;
                }
            }

            if (!areNotPrime) {
                isPrimeFactors = areNotPrime;
                break;
            }
        }

        if (product != n) {
            return false;
        }

        return isPrimeFactors;
    }

    public static void main(String[] args) {
        int[] myArr = {2, 3, 5, 7, 11};

        System.out.println(arePrimeFactors(2310, myArr));
    }
}
