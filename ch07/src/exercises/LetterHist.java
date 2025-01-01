package exercises;

import java.util.Arrays;

public class LetterHist {
    public static int[] letterHist(String phrase) {
        int[] histogram = new int[26];

        for (int i = 0; i < phrase.length(); i++) {
            char c = Character.toLowerCase(phrase.charAt(i));

            if (c >= 'a' && c <= 'z') {
                histogram[c - 'a']++;
            }
        }

        return histogram;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(letterHist("My place at all")));
    }
}
