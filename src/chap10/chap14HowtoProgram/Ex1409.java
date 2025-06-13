package chap10.chap14HowtoProgram;

import java.util.Scanner;

public class Ex1409 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your sentence: ");
        String[] s = input.nextLine().split(" ");

        for (int i = s.length - 1; i >= 0; i--) {
            System.out.println(s[i]);
        }
    }
}


