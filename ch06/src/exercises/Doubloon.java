package exercises;

import java.util.Scanner;

public class Doubloon {
    public static boolean isDoubloon(String word) {
        boolean isDou = true;

        for (int i = 0; i < word.length(); i++) {
            int quantityLetters = 0;

            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    quantityLetters++;
                }
            }

            if (quantityLetters != 2) {
                isDou = false;
                break;
            }
        }

        return isDou;
    }

    public static void main(String[] args) {
        String word;
        Scanner sc = new Scanner(System.in);

        System.out.println("Let's see if your word is a Doubloon!");
        System.out.print("Tell me the word: ");
        word = sc.next().toLowerCase();

        if (isDoubloon(word)) {
            System.out.println("Your word is a Doubloon");
        } else {
            System.out.println("Your word is not a Doubloon");
        }
    }
}
