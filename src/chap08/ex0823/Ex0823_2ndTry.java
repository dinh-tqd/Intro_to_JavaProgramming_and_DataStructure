package chap08.ex0823;

public class Ex0823_2ndTry {
    public static void main(String[] args) {
        int[][] grid = {
                {1,1,1,0,1,1},
                {1,1,1,1,0,0},
                {0,1,0,1,1,1},
                {1,1,1,1,1,1},
                {0,1,1,1,1,0},
                {1,0,0,0,0,1}
        };

        System.out.println("The flipped cell is at ("
                + findFirstRowUnevenOnes(grid) + ", " + findFirstColumnUnevenOnes(grid) + ").");
    }

    public static int findFirstRowUnevenOnes(int[][] grid) {
        for (int r = 0; r < grid.length; r++) {
            int oneCount = 0;
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] == 1)
                    oneCount++;
            }
            if (oneCount % 2 != 0) {
                return r;
            }
        }
        return -1; // Find nothing wrong
    }

    public static int findFirstColumnUnevenOnes(int[][] grid) {
        for (int c = 0; c < grid[0].length; c++) {
            int oneCount = 0;
            for (int r = 0; r < grid.length; r++) {
                if (grid[r][c] == 1) {
                    oneCount++;
                }
            }
            if (oneCount % 2 != 0) {
                return c;
            }
        }
        return -1; // Find nothing wrong
    }
}
