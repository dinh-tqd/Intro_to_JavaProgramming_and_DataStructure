package chap10.chap14HowtoProgram;

import java.util.Scanner;

public class Ex1403 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Enter your string: ");
            String s1 = input.nextLine();
            String s2 = new StringBuilder(s1).reverse().toString();

            System.out.print("Is this a palindrome ?: ");
            System.out.println(s1.equals(s2));

            System.out.println();
            System.out.println("Choice ? 1 = continue: ");
            choice = input.nextInt();
            input.nextLine();

        } while (choice == 1);
    }
}
