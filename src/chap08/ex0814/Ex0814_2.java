package chap08.ex0814;

import java.util.Scanner;

public class Ex0814_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the square matrix: ");
        int size = input.nextInt();
        int[][] m = new int[size][size];

        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                m[r][c] = (int) (Math.random() * 2);
            }
        }

        printMatrix(m);

        checkRow(m);
        checkColumn(m);
        checkMajorDiagonal(m);
        checkSubDiagonal(m);
    }

    public static void printMatrix(int[][] m) {
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                System.out.print(m[r][c]);
                if (c == m[r].length - 1) {
                    System.out.println();
                }
            }
        }
    }

    public static void checkRow(int[][] m) {
        boolean found = false;
        for (int r = 0; r < m.length; r++) {
            int count = 0;
            for (int c = 0; c < m[r].length; c++) {
                if (m[r][c] == m[r][0]) {
                    count++;
                }
            }
            if (count == m[r].length) {
                System.out.println("All " + m[r][0] + "s on row " + r);
                found = true;
            }
        }
        if (!found)
            System.out.println("No same numbers on a row.");
    }

    public static void checkColumn(int[][] m) {
        boolean found = false;
        for (int c = 0; c < m[0].length; c++) {
            int count = 0;
            for (int r = 0; r < m.length; r++) {
                if (m[r][c] == m[0][c]) {
                    count++;
                }
            }
            if (count == m[0].length) {
                System.out.println("All " + m[0][c] + "s on colum " + c);
                found = true;
            }
        }
        if (!found)
            System.out.println("No same numbers on a column.");
    }

    public static void checkMajorDiagonal(int[][] m) {
        boolean found = false;
        int count = 0;
        for (int r = 0; r < m.length; r++) {
            int c = r;
            if (m[r][c] == m[0][0]) {
                count++;
            }
        }
        if (count == m.length) {
            System.out.println("All " + m[0][0] + "s on the major diagonal.");
            found = true;
        }
        if (!found)
            System.out.println("No same numbers on the major diagonal.");
    }

    public static void checkSubDiagonal(int[][] m) {
        boolean found = false;
        int count = 0;
        for (int r = 0; r < m.length; r++) {
            int c = m.length - 1 - r;
            if (m[r][c] == m[0][m.length - 1]) {
                count++;
            }
        }

        if (count == m.length) {
            System.out.println("All " + m[0][m.length - 1] + "s on the sub-diagonal.");
            found = true;
        }
        if (!found)
            System.out.println("No same numbers on the sub-diagonal.");
    }
}
