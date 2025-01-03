package exercises;

public class Ackermann {
    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return ackermann(m - 1, ackermann(m, n - 1));
        }

        return 0; // stub
    }
    public static void main(String[] args) {
        System.out.println(ackermann(3, 3));
    }
}
