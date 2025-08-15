package chap08.ex0802;

import java.util.Arrays;

public class Ex0802 {
    public static void main(String[] args) {
        double[][] m = {
                {1,2,3,4},
                {5,6.5,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        for (double[] r : m)
            System.out.println(Arrays.toString(r));
        System.out.println("Sum is : " + formatDouble(sumMajorDiagonal(m)));
        System.out.print("\n\n---\n\n");

        // random m test
        for (int testCount = 0; testCount < 5; testCount++) {
            int size = testCount;
            m = new double[size][size];
            for (int r = 0; r < size; r++) {
                for (int c = 0; c < size; c++) {
                    m[r][c] = Math.random() * 10;
                    m[r][c] = formatDouble(m[r][c]);
                }
            }

            for (double[] r : m) {
                System.out.println(Arrays.toString(r));
            }
            System.out.println("Sum is : " + formatDouble(sumMajorDiagonal(m)));

            System.out.print("\n\n---\n\n");
        }
    }

    public static double sumMajorDiagonal(double[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    public static double formatDouble(double a) {
        String format = String.format("%.2f", a);
        return Double.parseDouble(format);
    }
}
