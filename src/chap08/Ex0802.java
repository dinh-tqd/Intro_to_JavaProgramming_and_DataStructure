package chap08;

public class Ex0802 {
    public static void main(String[] args) {
        double[][] matrix = {
                {1,2,3,4},
                {5,6.5,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        System.out.println(sumMajorDiagonal(matrix));
    }

    public static double sumMajorDiagonal(double[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
}
