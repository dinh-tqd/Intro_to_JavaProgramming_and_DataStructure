package chap10.chap14HowtoProgram;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Ex1420_notDone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String checkAmountString = input.nextLine();
        StringBuilder sb = new StringBuilder(checkAmountString);

        System.out.println(checkAmountString);
        for (int i = 0; i < 9 - checkAmountString.length(); i++) {
            sb.insert(0, "*");
        }

        System.out.println(sb.toString());
    }
}

// IT CAN NOT BE THIS SIMPLE