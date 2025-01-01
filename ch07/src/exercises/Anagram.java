package exercises;

import java.util.Arrays;

public class Anagram {
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

    public static boolean anagram(String phrase1, String phrase2) {
        int[] histo1 = letterHist(phrase1);
        int[] histo2 = letterHist(phrase2);

        if (!Arrays.equals(histo1, histo2)) {
            return false;
        }

        return true;
    }

    public static boolean anotherAnagram(String phrase1, String phrase2) {
        phrase1 = phrase1.replace(" ", "");
        phrase2 = phrase2.replace(" ", "");

        for (int i = 0; i < phrase1.length(); i++) {
            char charPh1 = phrase1.charAt(i);
            int indexPh2 = phrase2.indexOf(charPh1);

            if (indexPh2 == -1) {
                return false;
            }

            phrase2 = phrase2.substring(0, indexPh2) + phrase2.substring(indexPh2 + 1);
        }

        return phrase2.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(anagram("christopher mayfield", "hi prof the camel is dry"));
        System.out.println(anotherAnagram("christopher mayfield", "hi prof the camel is dry"));
    }
}
