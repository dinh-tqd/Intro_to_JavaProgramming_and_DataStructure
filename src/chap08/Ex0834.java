package chap08;

import java.util.Scanner;
import java.util.Arrays;

public class Ex0834 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 6 points: ");
        double[][] points = new double[6][2];
        for (int r = 0; r < 6; r++) {
            for (int c = 0; c < 2; c++) {
                points[r][c] = input.nextDouble();
            }
        }

        System.out.println(Arrays.toString(getRightmostLowestPoint(points)));
    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        double minY = points[0][1];
        double maxX = points[0][0];

        for (int r = 0; r < points.length; r++) {
            if (points[r][1] < minY) {
                minY = points[r][1];
                maxX = points[r][0];
            } else if (points[r][1] == minY) {
                if (points[r][0] > maxX) {
                    maxX = points[r][0];
                }
            }
        }
        return new double[] {maxX, minY};
    }
}
