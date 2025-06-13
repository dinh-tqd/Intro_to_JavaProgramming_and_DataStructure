package chap10.chap14HowtoProgram;

import java.util.Scanner;

public class Ex1415 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integer code: ");
        String inputCode = input.next();

        int n = Integer.parseInt(inputCode);
        System.out.println((char)n);

//        for (int i = 0; i <= 255; i++) {
//            System.out.printf("%3d    %c%n", i, (char)i);
//        }
    }
}
