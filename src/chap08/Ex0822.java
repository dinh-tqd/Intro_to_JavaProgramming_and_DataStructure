package chap08;

import java.util.Arrays;

public class Ex0822 {
    public static void main(String[] args) {
//        int[][] matrix = new int[6][6];
//        for (int r = 0; r < matrix.length; r++) {
//            for (int c = 0; c < matrix[0].length; c++) {
//                matrix[r][c] = (int)(Math.random() * 2);
//            }
//        }

        int[][] matrix = {
                {1,0,1,0,1,1},
                {1,1,1,1,1,1},
                {1,0,1,0,1,1},
                {1,1,1,1,1,1},
                {1,1,1,1,1,1},
                {1,1,1,1,1,1},
        };

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println(testRow(matrix));
        System.out.println(testColumn(matrix));
    }

    public static boolean testRow(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            int oneCount = 0;
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == 1) {
                    oneCount++;
                }
            }
            if (oneCount % 2 == 1) return false;
        }
        return true;
    }

    public static boolean testColumn(int[][] matrix) {
        for (int c = 0; c < matrix[0].length; c++) {
            int oneCount = 0;
            for (int r = 0; r < matrix.length; r++) {
                if (matrix[r][c] == 1) {
                    oneCount++;
                }
            }
            if (oneCount % 2 == 1) return false;
        }
        return true;
    }
}
