package chap08.ex0836;

import java.util.Scanner;
import java.util.Arrays;

public class Ex0836_3rdTry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = input.nextInt();

        char[][] m = new char[n][n];
        System.out.printf("Enter %d rows of letters separated by space: %n", n);

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                m[r][c] = input.next().charAt(0);
                if (m[r][c] < 'A' || m[r][c] > 'A' + n - 1) {
                    System.out.printf("Wrong input: the letters must be from %c to %c", 'A', (char)('A' + n - 1));
                    return;
                }
            }
        }

        System.out.println(isLatinSquare(m));
    }

    public static boolean isLatinSquare(char[][] m) {
        for (int r = 0; r < m.length; r++) {
            boolean[] seen = new boolean[m[r].length];
            for (int c = 0; c < m[r].length; c++) {
                int index = m[r][c] - 'A';
                if (index < 0 || index >= m.length || seen[index]) return false;
                seen[index] = true;
            }
        }

        for (int c = 0; c < m[0].length; c++) {
            boolean[] seen = new boolean[m.length];
            for (int r = 0; r < m.length; r++) {
                int index = m[r][c] - 'A';
                if (index < 0 || index >= m.length || seen[index]) return false;
                seen[index] = true;
            }
        }

        return true;
    }
}
