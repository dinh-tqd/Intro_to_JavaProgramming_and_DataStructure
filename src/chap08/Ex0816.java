package chap08;

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

        primarySortOnRows(m);
        secondarySortOnColumns(m);

        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void primarySortOnRows(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i][0] > a[j][0]) {
                    int[] temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void secondarySortOnColumns(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i][0] == a[j][0] && a[i][1] > a[j][1]) {
                    int[] temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
