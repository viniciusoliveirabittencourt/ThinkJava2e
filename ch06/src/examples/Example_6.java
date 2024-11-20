package examples;

public class Example_6 {
    public static void main(String[] args) {
        String r = "", s = "banana";

        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }

        System.out.println(r);
    }
}
