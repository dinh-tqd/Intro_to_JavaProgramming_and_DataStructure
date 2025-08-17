package chap08.ex0836;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0836_2ndTry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = input.nextInt();

        char[][] a = new char[n][n];
        System.out.println("Enter " + n + " rows of letters separated by spaces: ");
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                a[r][c] = input.next().charAt(0);
                if (checkInput(n, a[r][c])) {
                    System.out.println("Wrong input: the letters must be from A to " + (char)('A' + n - 1));
                    System.exit(1);
                }
            }
        }

        for (char[] r : a) {
            System.out.println(Arrays.toString(r));
        }

        System.out.println(checkRow(a));
        System.out.println(checkColumn(a));
    }

    public static boolean checkInput(int n, char c) {
        return (c < 'A' || c > 'A' + n - 1);
    }

    public static boolean checkRow(char[][] a) {
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                for (int c2 = c + 1; c2 < a[r].length; c2++) {
                    if (a[r][c] == a[r][c2]) {
                        System.out.println("Char " + a[r][c] + " is duplicated in row " + r);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean checkColumn(char[][] a) {
        for (int c = 0; c < a[0].length; c++) {
            for (int r = 0; r < a.length; r++) {
                for (int r2 = r + 1; r2 < a.length; r2++) {
                    if (a[r][c] == a[r2][c]) {
                        System.out.println("Char " + a[r][c] + " is duplicated in column " + c);
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
