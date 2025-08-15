package chap08.ex0815;

import java.util.Scanner;

public class Ex0815 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[5][2];
        System.out.println("Enter five points: ");
        for (int i = 0; i < 5; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        System.out.println(sameLine(points));
    }

    public static boolean sameLine(double[][] points) {
        for (int i = 2; i < points.length; i++) {
            if (!sameLine(points[0], points[1], points[i])) return false;
        }
        return true;
    }

    public static boolean sameLine(double[] point0, double[] point1, double[] point2) {
        double x = (point1[0] - point0[0]) * (point2[1] - point0[1]) - (point2[0] - point0[0]) * (point1[1] - point0[1]);
        return (x == 0);
    }
}
