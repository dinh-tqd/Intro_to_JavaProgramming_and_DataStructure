package chap08;

import java.util.Scanner;

public class Ex0828 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] m1 = new int[3][3];
        System.out.println("Enter list1: ");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                m1[r][c] = input.nextInt();
            }
        }

        int[][] m2 = new int[3][3];
        System.out.println("Enter list2: ");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                m2[r][c] = input.nextInt();
            }
        }

        System.out.println(equals(m1, m2));
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        for (int r = 0; r < m1.length; r++) {
            for (int c = 0; c < m1[0].length; c++) {
                if (m1[r][c] != m2[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }
}
