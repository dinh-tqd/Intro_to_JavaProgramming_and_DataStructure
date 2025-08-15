package chap08.ex0815;

public class Ex0815_2 {
    public static void main(String[] args) {
        double[][] points1 = {{3.4, 2}, {6.5, 9.5}, {2.3, 2.3}, {5.5, 5}, {-5, 4}};
        System.out.println(sameLine(points1));

        double[][] points2 = {{1,1},{2,2},{3,3},{4,4},{5,5}};
        System.out.println(sameLine(points2));

    }

    public static boolean sameLine(double[][] points) {
        for (int i = 2; i < points.length; i++) {
            double x = (points[1][0] - points[0][0]) * (points[i][1] - points[0][1])
                    - (points[i][0] - points[0][0]) * (points[1][1] - points[0][1]);
            if (x != 0)
                return false;
        }
        return true;
    }
}
