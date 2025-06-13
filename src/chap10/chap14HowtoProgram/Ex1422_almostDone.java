package chap10.chap14HowtoProgram;

import java.util.Scanner;
import java.util.Arrays;

public class Ex1422_almostDone {
    static final String[] digitCode = {
            ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----",
    };

    static final String[] letterCode = {
            ".-", "-...", "-.-.", "-..", ".",                                 // A, B, C, D, E
            "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",         // F,G,H,I,J,K,L,M
            "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",            // N,O,P,Q,R,S,T,U
            "...-", ".--", "-..-", "-.--", "--..",
    };

    public static void main(String[] args) {

        String s1 = "Hello world";
        System.out.println(convertToMorse(s1));

        String s2 = ".... . .-.. .-.. ---   .-- --- .-. .-.. -..";
        System.out.println(convertMorseToText(s2));
    }

    // To a String to Morse Code
    public static String convertToMorse(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            sb.append(convertToMorse(word.charAt(i)));
            sb.append(" ");
        }
        return sb.toString();
    }

    // Convert a char to Morse Code
    public static String convertToMorse(char c) {
        if (Character.isDigit(c)) {
            return digitCode[c - '0'];
        }
        if (Character.isLetter(c)) {
            char c1 = Character.toUpperCase(c);
            return letterCode[c1 - 'A'];
        }
        if (c == ' ') {
            return "   ";
        }
        return "?";
    }

    // Convert Char Morse Code to a Character
    public static char convertToCharacter(String charMorseString) {
        if (charMorseString.length() == 5) {
            for (int i = 0; i < digitCode.length; i++) {
                if (charMorseString.equals(digitCode[i])) {
                    return (char) ('0' + i);
                }
            }
        }
        for (int i = 0; i < letterCode.length; i++) {
            if (charMorseString.equals(letterCode[i])) {
                return (char) ('A' + i);
            }
        }
        if (charMorseString.equals("___")) {
            return ' ';
        }
        return '?';
    }

    // Convert MORSE TO TEXT
    public static String convertMorseToText(String s) {
        s = s.replaceAll(" {3,}", "   ");      // normalize multiple spaces
        s = s.replaceAll("   ", " ___ ");      // mark word boundaries with ___

        String[] array = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String morseChar : array) {
            result.append(convertToCharacter(morseChar));
        }
        return result.toString();
    }
}
