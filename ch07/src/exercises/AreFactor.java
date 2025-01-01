package exercises;

public class AreFactor {
    public static boolean areFactors(int n, int[] intArr) {
        boolean isFactor = true;

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % n != 0) {
                isFactor = false;
                break;
            }
        }

        return isFactor;
    }

    public static void main(String[] args) {
        int[] myArr = {2, 4, 6, 8, 9};

        System.out.println(areFactors(2, myArr));
    }
}
