package chap08;

import java.util.Scanner;
import java.util.Arrays;

public class Ex0836_greatButByAI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number n: ");
        int n = input.nextInt();
        char[][] m = new char[n][n];

        System.out.printf("Enter %d rows of letters seperated by spaces: ", n);
        outerLoop:
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++ ) {
                m[r][c] = input.next().charAt(0);

                if (m[r][c] < 'A' || m[r][c] > 'A' + n - 1) {
                    System.out.printf("Wrong input: the letters must be from %c to %c%n", 'A', (char)('A' + n - 1));
                    break outerLoop;
                }
            }
        }

        for (char[] row: m) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println(isLatinSquare(m));
    }

    public static boolean isLatinSquare(char[][] m) {
        int n = m.length;

        // testRow
        for (int r = 0; r < n; r++) {
            boolean seen[] = new boolean[n];
            for (int c = 0; c < n; c++) {
                int index = m[r][c] - 'A';
                if (index < 0 || index >= n || seen[index]) return false;
                seen[index] = true;
            }
        }

        // testCol
        for (int c = 0; c < n; c++) {
            boolean seen[] = new boolean[n];
            for (int r = 0; r < n; r++) {
                int index = m[r][c] - 'A';
                if (index < 0 || index >= n || seen[index]) return false;
                seen[index] = true;
            }
        }

        return true;
    }
}

// Keyword: Ánh xạ