package chap08;

import java.util.Scanner;
import java.util.Arrays;

public class Ex0813 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the array: ");
        int rowCount = input.nextInt();
        int colCount = input.nextInt();

        double[][] a = new double[rowCount][colCount];

        System.out.println("Enter the elements of the array: ");
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                a[row][col] = input.nextDouble();
            }
        }

        System.out.println(Arrays.toString(locateLargest(a)));
    }

    public static int[] locateLargest(double[][] a) {
        double max = a[0][0];
        int[] result = {0, 0};
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[0].length; c++) {
                if (a[r][c] > max) {
                    max = a[r][c];
                    result[0] = r;
                    result[1] = c;
                }
            }
        }
        return result;
    }
}
