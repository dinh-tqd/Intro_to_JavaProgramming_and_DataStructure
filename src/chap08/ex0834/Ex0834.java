package chap08.ex0834;

import java.util.Scanner;
import java.util.Arrays;

public class Ex0834 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 6 points: ");
        // 1.5 2.5 -3 4.5 5.6 -7 6.5 -7 8 1 10 2.5

        double[][] points = new double[6][2];
        for (int r = 0; r < 6; r++) {
            for (int c = 0; c < 2; c++) {
                points[r][c] = input.nextDouble();
            }
        }

        System.out.println(Arrays.toString(getRightmostLowestPoint(points)));
    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        int index = 0;
        double resultX = points[index][0];
        double resultY = points[index][1];


        for (int r = 0; r < points.length; r++) {
            if (points[r][1] < resultY) {
                index = r;
                resultY = points[r][1];
                resultX = points[r][0];
            } else if (points[r][1] == resultY) {
                if (points[r][0] > resultX) {
                    index = r;
                    resultX = points[r][0];
                }
            }
        }
        return new double[] {resultX, resultY};
    }
}
