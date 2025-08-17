package chap08.ex0816;

import java.util.Arrays;

public class Ex0816 {
    public static void main(String[] args) {
        int[][] m = {
                {4, 2},
                {1, 7},
                {4, 5},
                {1, 2},
                {1, 1},
                {4, 1}
        };

        sort(m);
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void sort(int m[][]) {
        // Primary Sort on rows
        for (int i = 0; i < m.length; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (m[i][0] > m[j][0]) {
                    int[] temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }
        }

        // Secondary Sort on Columns
        for (int i = 0; i < m.length; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (m[i][0] == m[j][0] && m[i][1] > m[j][1]) {
                    int[] temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }
        }
    }
}
