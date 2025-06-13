package chap10.chap14HowtoProgram;

import java.util.Scanner;
import java.util.Arrays;

public class Ex1412 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a line of text");
        String originalString = input.nextLine();

        String s = originalString.toLowerCase();
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            boolean isDuplicateCharacter = false;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    isDuplicateCharacter = true;
                    break;
                }
            }

            if (!isDuplicateCharacter) {
                System.out.println("Character " + s.charAt(i) + " appears " + countChar(s, s.charAt(i)));
            }
        }
    }

    public static int countChar(String s, char c) {
        int count = 0;

        int i = 0;
        while (s.indexOf(c, i) != -1) {
            count++;
            i = s.indexOf(c, i) + 1;
        }
        return count;
    }
}
