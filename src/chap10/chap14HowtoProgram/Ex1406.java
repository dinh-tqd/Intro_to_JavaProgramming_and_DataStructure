package chap10.chap14HowtoProgram;

import java.util.Scanner;

public class Ex1406 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the password: ");
        String password = input.next();
        System.out.println(password);
        System.out.println(PassWord.validLength(password));
        System.out.println(PassWord.validStart(password));
        System.out.println(PassWord.containsUpperCaseCharacter(password));
        System.out.println(PassWord.containsNumberCharacter(password));
    }
}

class PassWord {
    public static boolean validLength(String s) {
        int n = s.length();
        return (n >= 8 && n <= 15);
    }

    public static boolean validStart(String s) {
        if (!s.isEmpty()) {
            return Character.isLetter(s.charAt(0));
        }
        return false;
    }

    public static boolean containsUpperCaseCharacter(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsNumberCharacter(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
