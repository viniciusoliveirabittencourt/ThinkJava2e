package exercises;

public class OddSum {
    public static int oddSum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + oddSum(--n);
    }
    public static void main(String[] args) {
        System.out.println(oddSum(10));
    }
}
