package chap10.chap14HowtoProgram;

import java.util.Scanner;
import java.util.Arrays;

public class Ex1410 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println();
        System.out.println("Enter a sentence: ");
        String[] words =  input.nextLine().split(" ");
        System.out.println(Arrays.toString(words));

        int maxLength = words[0].length();
        int maxLengthIndex = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                maxLengthIndex = i;
            }
        }

        System.out.println(words[maxLengthIndex]);
        System.out.println(maxLength);
        System.out.println(maxLengthIndex);
    }
}
