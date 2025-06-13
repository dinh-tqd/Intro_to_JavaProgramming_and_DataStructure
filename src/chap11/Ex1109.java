package chap11;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Ex1109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array size n: ");
        int n = input.nextInt();

        int[][] m = new int[n][n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                m[r][c] = (int)(Math.random() * 2);
            }
        }

        for (int[] r : m) {
            System.out.println(Arrays.toString(r));
        }

        System.out.println(rowIndicesWithMost1(m));
        System.out.println(columnIndicesWithMost1(m));
    }

    public static ArrayList<Integer> rowIndicesWithMost1(int[][] m) {
        ArrayList<Integer> list = new ArrayList<>();
        int max1CountPerRow = 0;
        for (int r = 0; r < m.length; r++) {
            int count = 0;
            for (int c = 0; c < m[r].length; c++) {
                if (m[r][c] == 1)
                    count++;
            }
            if (count > max1CountPerRow) {
                max1CountPerRow = count;
                list.clear();
                list.add(r);
            } else if (count == max1CountPerRow) {
                list.add(r);
            }
        }
        return list;
    }

    public static ArrayList<Integer> columnIndicesWithMost1(int[][] m) {
        ArrayList<Integer> list = new ArrayList<>();

        int max1CountPerColumn = 0;
        for (int c = 0; c < m[0].length; c++) {
            int count = 0;
            for (int r = 0; r < m.length; r++) {
                if (m[r][c] == 1)
                    count++;
            }
            if (count > max1CountPerColumn) {
                max1CountPerColumn = count;
                list.clear();
                list.add(c);
            } else if (count == max1CountPerColumn) {
                list.add(c);
            }
        }

        return list;
    }
}
