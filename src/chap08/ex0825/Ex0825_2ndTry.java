package chap08.ex0825;

import java.util.Scanner;

public class Ex0825_2ndTry {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        double[][] m = new double[3][3];
//        System.out.println("Enter a 3-by-3 matrix row by row: ");
//        for (int r = 0; r < m.length; r++) {
//            for (int c = 0; c < m[0].length; c++) {
//                m[r][c] = input.nextDouble();
//            }
//        }

        //        true case
        double[][] m = {
                {0.15, 0.875, 0.375},
                {0.55, 0.005, 0.225},
                {0.3, 0.12, 0.4},
        };

//        false case
//        double[][] m = {
//                {0.95, -0.875, 0.375 },
//                {0.65, 0.005, 0.225},
//                {0.3, 0.22, -0.4},
//        };

        System.out.println(isMarkovMatrix(m));
    }

    public static boolean isMarkovMatrix(double[][] m) {
        for (double[] r : m) {
            for (double e : r) {
                if (e < 0)
                    return false;
            }
        }

        for (int c = 0; c < m[0].length; c++) {
            double columnSum = 0;
            for (int r = 0; r < m.length; r++) {
                columnSum += m[r][c];
            }
            if (columnSum != 1)
                return false;
        }

        return true;
    }
}
