package exercises;

import java.util.Scanner;

public class Abecedarian {
    public static boolean isAbecedarian(String word) {
        boolean isAbece = true;
        for (int i = 1; i < word.length(); i++) {
            char charNow, charLast;
            charNow = word.charAt(i);
            charLast = word.charAt(i - 1);

            if (charNow < charLast) {
                isAbece = false;
            }
        }

        return isAbece;
    }

    public static void main(String[] args) {
        String word;
        Scanner sc = new Scanner(System.in);

        System.out.println("Let's see if your word is a Abecedarian!");
        System.out.print("Tell me the word: ");
        word = sc.next();

        if (isAbecedarian(word)) {
            System.out.println("Your word is an Abecedarian");
        } else {
            System.out.println("Your word is not an Abecedarian");
        }
    }
}
