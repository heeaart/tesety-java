package org.example;

public class LongestWordl {
    public static String longestWord(String paragraph) {
        String longestWord = "";
        paragraph = paragraph.replaceAll("[\\-\\+\\.\\^:,]", "");
        String[] words = paragraph.split(" ");
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}