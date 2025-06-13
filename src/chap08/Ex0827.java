package chap08;

import java.util.Arrays;

public class Ex0827 {
    public static void main(String[] args) {
        double[][] m = {
                {0.95, -0.875, 0.375 },
                {0.65, 0.005, 0.225},
                {0.3, 0.22, -0.4},
        };

        for (double[] row: sortColumns(m)) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static double[][] sortColumns(double[][] m) {
        double[][] result = new double[m.length][m[0].length];
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[0].length; c++) {
                result[r][c] = m[r][c];
            }
        }



        for (int c = 0; c < result[0].length; c++) {
            for (int r = 0; r < result.length; r++) {
                for (int r1 = r + 1; r1 < result.length; r1++) {
                    if (result[r][c] > result[r1][c]) {
                        double temp = result[r][c];
                        result[r][c] = result[r1][c];
                        result[r1][c] = temp;
                    }
                }
            }
        }

        return result;
    }
}
