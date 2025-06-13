package chap10.chap14HowtoProgram;

import java.util.Scanner;
import java.util.Arrays;

public class Ex1413 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a line of text: ");

        String[] s = input.nextLine().split(" ");
        System.out.println(Arrays.toString(s));

        for (int i = 0; i < s.length; i++) {
            if (s[i].charAt(0) >= 'A' && s[i].charAt(0) <= 'Z') {
                System.out.println(s[i]);
            }
        }
    }
}
