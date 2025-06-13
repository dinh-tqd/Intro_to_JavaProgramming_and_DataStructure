package chap10.chap14HowtoProgram;

import java.util.Scanner;
import java.util.Arrays;

public class Ex1414 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a line of text: ");
        String originalString = input.nextLine();

        String[] strings = originalString.split(" ");
        for (String string : strings ) {
            if (string.endsWith("ED")) {
                System.out.println(string);
            }
        }
    }
}
