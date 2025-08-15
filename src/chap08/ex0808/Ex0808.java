package chap08.ex0808;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0808 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of points: ");
        int pointCount = input.nextInt();

        double[][] points = new double[pointCount][2];
        System.out.println("Enter " + pointCount + " points:");
        for (int count = 0; count < pointCount; count++) {
            points[count][0] = input.nextDouble();
            points[count][1] = input.nextDouble();
        }

        double shortestDistance = shortestDistance(points);
        listPairOfPoints(points, shortestDistance);
        System.out.println("Their distance is " + shortestDistance);
    }

    public static double distance(double[] point1, double[] point2) {
        return Math.sqrt((point1[0] - point2[0]) * (point1[0] - point2[0])
                + (point1[1] - point2[1]) * (point1[1] - point2[1]));
    }

    public static double shortestDistance(double[][] points) {
        int p1 = 0, p2 = 1;
        double shortestDistance = distance(points[p1], points[p2]);

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i], points[j]);

                if (distance < shortestDistance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }
        return shortestDistance;
    }

    public static void listPairOfPoints(double[][] points, double distance) {
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (distance(points[i], points[j]) == distance) {
                    System.out.println(Arrays.toString(points[i]) + " and " + Arrays.toString(points[j]));
                }
            }
        }
    }
}
