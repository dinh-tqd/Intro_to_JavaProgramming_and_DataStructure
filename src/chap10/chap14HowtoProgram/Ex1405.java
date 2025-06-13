package chap10.chap14HowtoProgram;

import java.util.Scanner;

public class Ex1405 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] stringArray = new String[16];
        int withSpecialCharacterCount = 0;
        int withoutSpecialCharacterCount = 0;

        System.out.println("Enter strings: ");

        int i = 0;
        String current;
        while (true) {
            current = input.next();
            if (current.equals("#")) {
                break;
            }

            stringArray[i] = current;
            if (containsSpecialChar(stringArray[i])) {
                withSpecialCharacterCount++;
            } else {
                withoutSpecialCharacterCount++;
            }

            i++;
        }

        System.out.println(withSpecialCharacterCount);
        System.out.println(withoutSpecialCharacterCount);
    }

    public static boolean containsSpecialChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!((s.charAt(i) >= '0' && s.charAt(i) <= '9')
                    || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                    || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))) {
                return true;
            }
        }
        return false;
    }
}
