package chap08.ex0822;

import java.util.Arrays;

public class Ex0822_2ndTry {
    public static void main(String[] args) {
        int[][] grid = new int[6][6];
        for (int r = 0; r < 6; r++) {
            for (int c = 0; c < 6; c++) {
                grid[r][c] = (int)(Math.random() * 2);
            }
        }

        for (int[] row : grid)
            System.out.println(Arrays.toString(row));

        System.out.println("ROW ? " + checkRow(grid));
        System.out.println("COLUMN ? " + checkColumn(grid));
    }

    public static boolean checkRow(int[][] grid) {
        for (int r = 0; r < grid.length; r++) {
            int oneCount = 0;
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] == 1)
                    oneCount++;
            }
            if (oneCount % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkColumn(int[][] grid) {
        for (int c = 0; c < grid[0].length; c++) {
            int oneCount = 0;
            for (int r = 0; r < grid.length; r++) {
                if (grid[r][c] == 1) {
                    oneCount++;
                }
            }
            if (oneCount % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
