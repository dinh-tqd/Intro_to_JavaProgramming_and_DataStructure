package chap02;

import java.util.Scanner;

public class ex0206 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int digitSum = 0;
        int alt = number;
        while (alt != 0 ) {
            digitSum += alt % 10;
            alt = alt / 10;
        }
        System.out.println(digitSum);
    }
}
