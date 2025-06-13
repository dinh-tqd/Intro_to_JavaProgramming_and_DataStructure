package chap10.chap14HowtoProgram;

import java.util.Scanner;
import java.util.Arrays;

public class Ex1418_try1 {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        countLetterOccurrence();
    }

    public static void countLetterOccurrence() {
//        System.out.println("Enter a sentence: ");
//        String originalSentence = input.nextLine();
        String originalSentence = "Hello World";

        int[] occurrences = new int[originalSentence.length()];
        char[] letters = new char[originalSentence.length()];

        int uniqueLetterCount = 0;
        for (int i = 0; i < originalSentence.length(); i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (originalSentence.charAt(i) == originalSentence.charAt(j)) {
                    isDuplicate = true;

                    break;
                }
            }
            if (!isDuplicate) {
                letters[uniqueLetterCount++] = originalSentence.charAt(i);
            }
        }

        System.out.println(Arrays.toString(letters));
    }
}
