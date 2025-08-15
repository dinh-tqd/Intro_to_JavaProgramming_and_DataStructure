package chap08.ex0810;
import java.util.Arrays;

public class Ex0810_2 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        // fill matrix with 0 and 1
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }

        printMatrix(matrix);

        System.out.println(largestRowIndex(matrix));
        System.out.println(largestColumnIndex(matrix));
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static int largestRowIndex(int[][] matrix) {
        int result = 0;
        int maxOneCountInRow = 0;

        for (int r = 0; r < matrix.length; r++) {
            int oneCount = 0;
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] == 1)
                    oneCount++;
            }
            if (oneCount > maxOneCountInRow) {
                result = r;
                maxOneCountInRow = oneCount;
            }
        }

        return result;
    }

    public static int largestColumnIndex(int[][] matrix) {
        int result = 0;
        int maxOneCountInColumn = 0;

        for (int c = 0; c < matrix[0].length; c++) {
            int oneCount = 0;
            for (int r = 0; r < matrix.length; r++) {
                if (matrix[r][c] == 1)
                    oneCount++;
            }
            if (oneCount > maxOneCountInColumn) {
                result = c;
                maxOneCountInColumn = oneCount;
            }
        }

        return result;
    }
}
