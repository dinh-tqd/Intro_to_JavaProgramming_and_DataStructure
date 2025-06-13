package chap08;

public class Ex0823 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1,0,1,1},
                {1,1,1,1,0,0},
                {0,1,0,1,1,1},
                {1,1,1,1,1,1},
                {0,1,1,1,1,0},
                {1,0,0,0,0,1},
        };

        System.out.println(testRow(matrix));
        System.out.println(testColumn(matrix));
        // If user didn't flip any cell, it will display -1 and -1
    }

    public static int testRow(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            int oneCount = 0;
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == 1) {
                    oneCount++;
                }
            }
            if (oneCount % 2 == 1) return r;
        }
        return -1;
    }

    public static int testColumn(int[][] matrix) {
        for (int c = 0; c < matrix[0].length; c++) {
            int oneCount = 0;
            for (int r = 0; r < matrix.length; r++) {
                if (matrix[r][c] == 1) {
                    oneCount++;
                }
            }
            if (oneCount % 2 == 1) return c;
        }
        return -1;
    }
}
