package chap08.ex0807;

import java.util.Arrays;

public class Ex0807 {
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};

        int p1 = 0, p2 = 1;  // Initial 2 points
        double shortestDistance = distance2Points(points[p1], points[p2]);
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (distance2Points(points[i], points[j]) < shortestDistance) {
                    shortestDistance = distance2Points(points[i], points[j]);
                    p1 = i;
                    p2 = j;
                }
            }
        }

        System.out.println(Arrays.toString(points[p1]));
        System.out.println(Arrays.toString(points[p2]));
        System.out.println(shortestDistance);
    }

    public static double distance2Points(double[] point1, double[] point2) {
        double x = Math.pow(point1[0] - point2[0], 2) +
                Math.pow(point1[1] - point2[1], 2) +
                Math.pow(point1[2] - point2[2], 2);
        return Math.sqrt(x);
    }
}
