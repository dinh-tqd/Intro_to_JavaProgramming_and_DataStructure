package chap10.chap14HowtoProgram;

import java.util.Scanner;

public class Ex1411 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a line of text");
        String s = input.nextLine();

        System.out.println("Enter the letter: ");
        char c = input.next().charAt(0);

        System.out.println(s);
        System.out.println(c);
        System.out.println(countChar(s, c));
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
