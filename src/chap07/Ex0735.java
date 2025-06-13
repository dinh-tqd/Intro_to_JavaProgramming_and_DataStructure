package chap07;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0735 {
    static final String[] words = {"write", "that", "down", "quickly", "okay"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int randomIndex = (int) (Math.random() * words.length);
        String finalAnswer = words[randomIndex];
        char[] finalAnswerInChars = finalAnswer.toCharArray();
        char[] guessAnswer = new char[finalAnswerInChars.length];
        Arrays.fill(guessAnswer, '*');

        int missCount = 0;
        while (containsLetter(guessAnswer, '*')) {
            System.out.print("(Guess) Enter a letter in word ");
            for (char c : guessAnswer) System.out.print(c);
            System.out.print(" > ");
            char guessChar = input.next().charAt(0);

            if (!containsLetter(finalAnswerInChars, guessChar)) {
                System.out.println("     " + guessChar + " is not in the word.");
                missCount++;
            } else if (containsLetter(guessAnswer, guessChar)) {
                System.out.println("     " + guessChar + " is already in the word.");
            } else {
                for (int i = 0; i < guessAnswer.length; i++) {
                    if (finalAnswerInChars[i] == guessChar) {
                        guessAnswer[i] = guessChar;
                    }
                }
            }
        }
        System.out.println("The word is " + finalAnswer + ".");
        System.out.println("You missed " + missCount + (missCount == 1 ? " time" : " times"));
    }

    public static boolean containsLetter(char[] finalAnswer, char letter) {
        for (char c : finalAnswer) {
            if (c == letter) {
                return true;
            }
        }
        return false;
    }
}
