package chap08;

import java.util.Scanner;
import java.util.Arrays;

public class Ex0814 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of the square matrix: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = (int)(Math.random() * 2);
            }
        }

//        int[][] matrix = {
//                {1,1,1,1},
//                {1,1,1,1},
//                {1,1,1,1},
//                {1,1,1,1},
//        };

        // Print the matrix
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        System.out.printf("%n%n%n");
        findRowsWithSameElements(matrix);
        findColsWithSameElements(matrix);
        majorDiagonalSameElementsCheck(matrix);
        minorDiagonalSameElementsCheck(matrix);
    }

    public static void findRowsWithSameElements(int[][] matrix) {
        int caseFound = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] != matrix[row][0]) {
                    break;
                }
                if (col == matrix[row].length - 1) {
                    caseFound++;
                    System.out.printf("All %ds on row %d%n", matrix[row][0], row + 1);
                }
            }
        }
        if (caseFound == 0) {
            System.out.println("No same numbers on a row");
        }
    }

    public static void findColsWithSameElements(int[][] matrix) {
        int caseFound = 0;
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] != matrix[0][col]) {
                    break;
                }
                if (row == matrix.length - 1) {
                    caseFound++;
                    System.out.printf("All %ds on column %d%n", matrix[0][col], col + 1);
                }
            }
        }
        if (caseFound == 0) {
            System.out.println("No same numbers on a column");
        }
    }

    public static void majorDiagonalSameElementsCheck(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] != matrix[0][0]) {
                System.out.println("No same numbers on the major diagonal");
                break;
            } else if (i == matrix.length - 1) {
                System.out.printf("All %ds on the major diagonal%n", matrix[0][0]);
            }
        }
    }

    public static void minorDiagonalSameElementsCheck(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][matrix.length - 1 - i] != matrix[0][matrix.length - 1]) {
                System.out.println("No same numbers on the minor diagonal%n");
                break;
            } else if (i == matrix.length - 1) {
                System.out.printf("All %ds on the minor diagonal", matrix[0][matrix.length - 1]);
            }
        }
    }
}
