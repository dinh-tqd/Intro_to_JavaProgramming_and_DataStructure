package chap10.chap14HowtoProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1418_try2 {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        String originalSentence = "To be, or not to be: that is the question: \nWhether 'tis nobler in the mind to suffer";
//        String originalSentence = input.nextLine();
        String originalSentence = "hello kitty hello I'm";
        countLetterOccurrence(originalSentence);
        System.out.println("________");
        wordLengthCount(originalSentence);
        System.out.println("________");
        wordOccurrenceCount(originalSentence);
    }

    public static void countLetterOccurrence(String originalSentence) {
        StringBuilder sb = new StringBuilder(originalSentence.toLowerCase());

        int[] occurrences = new int['z' - 'a' + 1];
//        System.out.println(Arrays.toString(occurrences));

        for (int i = 0; i < sb.length(); i++) {
            if (Character.isLetter(sb.charAt(i))) {
                occurrences[sb.charAt(i) - 'a']++;
            }
        }

//        System.out.println(Arrays.toString(occurrences));
        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] != 0) {
                System.out.println((char) (i + 'a') + "   " + "n=" + occurrences[i]);
            }
        }
    }

    public static void wordLengthCount(String originalSentence) {
//        StringBuilder sb = new StringBuilder(originalSentence);
//        for (int i = 0; i < sb.length(); i++) {
//             char c = sb.charAt(i);
//             boolean test = Character.isLetter(c) || c == '\'' || c == ' ';
//             if (!test) {
//                 sb.deleteCharAt(i);
//                 i--;
//             }
//        }
//        String[] words = sb.toString().split(" ");

        String cleaned = originalSentence.replaceAll("[^a-zA-Z' ]", "");
        String[] words = cleaned.toLowerCase()
                .trim()
                .split("\\s+"); // loại bỏ khoảng trắng dư

        System.out.println(Arrays.toString(words));

        int highestLength = 0;
        for (String word : words) {
            if (word.length() > highestLength) {
                highestLength = word.length();
            }
        }

        int[] wordLengthCount = new int[highestLength + 1];
        for (String word : words) {
            wordLengthCount[word.length()]++;
        }

        System.out.println(Arrays.toString(wordLengthCount));
    }

    public static void wordOccurrenceCount(String originalSentence) {
        String cleaned = originalSentence.replaceAll("[^a-zA-Z' ]", "");
        String[] words = cleaned.toLowerCase()
                .trim()
                .split("\\s+"); // remove unwanted spaces

        int uniqueWordsCount = 0;
        String[] uniqueWords = new String[words.length];
        int[] wordOccurrences = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    isDuplicate = true;
                    wordOccurrences[j]++;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueWords[uniqueWordsCount] = words[i];
                wordOccurrences[uniqueWordsCount]++;
                uniqueWordsCount++;
            }
        }

        System.out.println(Arrays.toString(uniqueWords));
        System.out.println(Arrays.toString(wordOccurrences));
    }
}

// So without knowledge of HashMap, my code is good enough ?
// ChatGPT:
// Yes, absolutely! Your current code works fine for small inputs and learning purposes.
// It correctly counts word occurrences by manually checking duplicates and keeping track with arrays.
//
// Pros of your approach:
// - Simple and straightforward to understand.
// - No need to learn new concepts or APIs if you're just starting out.
// - Works well with short texts or small datasets.
// Limitations compared to HashMap:
// - Inefficient for large texts (because nested loops make it O(n²)).
// - More complicated to manage counts manually.
// - Takes more code and can be error-prone with bigger inputs.