package chap08.ex0813;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0813 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int rCount = input.nextInt();
        int cCount = input.nextInt();

        double[][] m = new double[rCount][cCount];
        System.out.println("Enter the array: ");
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                m[r][c] = input.nextDouble();
            }
        }

        System.out.println(Arrays.toString(locateLargest(m)));
    }

    public static int[] locateLargest(double[][] a) {
        int[] result = new int[2];
        double max = a[0][0];
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
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
