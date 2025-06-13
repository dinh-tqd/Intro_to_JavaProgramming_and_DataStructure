package chap08;

import java.util.Arrays;

public class Ex0818 {
    public static void main(String[] args) {
        int[][] m = {
                {1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}
        };
        shuffle2(m);
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void shuffle1(int[][] m) {
        for (int r = 0; r < m.length; r++) {
            int randomRowIndex = (int) (Math.random() * m.length);
            int[] temp = m[r];
            m[r] = m[randomRowIndex];
            m[randomRowIndex] = temp;
        }
    }

    public static void shuffle2(int[][] m) {
        for (int r = 0; r < m.length; r++) {
            int randomRowIndex = (int)(Math.random() * (m.length - r)) + r;
            int[] temp = m[r];
            m[r] = m[randomRowIndex];
            m[randomRowIndex] = temp;
        }
    }
}
