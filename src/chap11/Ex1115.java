package chap11;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Ex1115 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of points: ");
        // 7
        int pointCount = input.nextInt();
        System.out.println("Enter the coordinates of the points: ");
        // -12 0 -8.5 10 0 11.4 5.5 7.8 6 -5.5 0 -7 -3.5 -5.5

        int count = 0;
        ArrayList<double[]> points = new ArrayList<>();
        while (count < pointCount) {
            double x = input.nextDouble();
            double y = input.nextDouble();
            points.add(new double[]{x, y});
            count++;
        }
        points.add(points.get(0));

        for (double[] point : points) {
            System.out.println(Arrays.toString(point));
        }
        System.out.println(polygonArea(points));
    }

    public static double polygonArea(ArrayList<double[]> points) {
        double area = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            area += points.get(i)[0] * points.get(i + 1)[1] - points.get(i + 1)[0] * points.get(i)[1];
        }
        return Math.abs(area) / 2;
    }
}

// nếu công thức sử dụng giá trị tuyệt đối thì không cần quan tâm ngược hay theo chiều kim đồng hồ
// nếu không có giá trị tuyệt đối thì các điểm phải nhập theo thứ tự ngược chiều kim đồng hồ