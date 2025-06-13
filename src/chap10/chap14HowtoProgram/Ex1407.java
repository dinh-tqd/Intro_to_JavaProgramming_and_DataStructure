package chap10.chap14HowtoProgram;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Ex1407 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String[] words = input.nextLine().split(" ");

        for (String word : words) {
            printLatinWord(word);
        }

    }

    public static void printLatinWord(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.append(sb.charAt(0))
                .deleteCharAt(0)
                .append("ay");
        System.out.println(sb.toString());
    }
}


