package examples;

public class Example_6 {
    public static boolean isDoubloon(String s) {
        int[] counts = new int[26];
        String lower = s.toLowerCase();

        for (char letter : lower.toCharArray()) {
            int index = letter - 'a';
            counts[index]++;
        }

        for (int count : counts) {
            if (count != 0 && count != 2) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(isDoubloon("Mama"));
        System.out.println(isDoubloon("Lama"));
    }
}
