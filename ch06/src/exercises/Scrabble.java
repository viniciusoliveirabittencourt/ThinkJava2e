package exercises;

import java.util.Scanner;

public class Scrabble {
    public static boolean canSpell(String word, String subWord) {
        boolean can = true;

        for (int i = 0; i < subWord.length(); i++) {
            char c = subWord.charAt(i);
            int index = word.indexOf(c);

            if (index != -1) {
                word = word.substring(0, index) + word.substring(index + 1);
            } else {
                can = false;
                break;
            }
        }

        return can;
    }

    public static void main(String[] args) {
        String word, subWord;
        Scanner sc = new Scanner(System.in);

        System.out.print("Tell me the word: ");
        word = sc.next();

        System.out.print("Tell me the word you want to verify: ");
        subWord = sc.next();

        if (canSpell(word, subWord)) {
            System.out.printf("You can make %s with %s\n", subWord, word);
        } else {
            System.err.printf("You can't make %s with %s\n", subWord, word);
        }
    }
}
