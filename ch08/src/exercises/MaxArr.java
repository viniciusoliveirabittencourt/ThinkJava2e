package exercises;

public class MaxArr {
    public static int max(int[] arr) {
        return maxInRange(arr, 0, arr.length - 1);
    }
    public static int maxInRange(int[] arr, int lowIndex, int maxIndex) {
        if (lowIndex == maxIndex) {
            return arr[lowIndex];
        }

        maxInRange(arr, ++lowIndex, maxIndex);

        if (arr[lowIndex] > arr[maxIndex]) {
            return arr[lowIndex];
        } else {
            return arr[maxIndex];
        }
    }
    public static void main(String[] args) {
        int[] test = {1, 8, 2, 3, 9};

        System.out.println(maxInRange(test, 0, 3));
        System.out.println(max(test));
    }
}
