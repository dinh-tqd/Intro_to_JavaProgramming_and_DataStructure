package chap08;
import java.util.Arrays;

public class Ex0810 {
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
        int maxSum = 0;
        for (int row = 0; row < matrix.length; row++) {
            int rowSum = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                rowSum += matrix[row][col];
            }
            if (rowSum > maxSum) {
                maxSum = rowSum;
                result = row;
            }
        }
        return result;
    }

    public static int largestColumnIndex(int[][] matrix) {
        int result = 0;
        int maxSum = 0;
        for (int col = 0; col < matrix[0].length; col++) {
            int colSum = 0;
            for (int row = 0; row < matrix.length; row++) {
                colSum += matrix[row][col];
            }
            if (colSum > maxSum) {
                maxSum = colSum;
                result = col;
            }
        }
        return result;
    }
}
