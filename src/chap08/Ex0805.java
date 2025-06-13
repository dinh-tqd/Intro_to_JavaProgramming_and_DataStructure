package chap08;
import java.util.Arrays;

public class Ex0805 {
    public static void main(String[] args) {
        double[][] mat1 = {
                {1,2,3,},
                {4,5,6,},
                {7,8,9,},
        };

        double[][] mat2 = {
                {0,2,4,},
                {1,4.5,2.2},
                {1.1,4.3,5.2},
        };

        double[][] sumMat = addTwoMatrices(mat1, mat2);
        for (int i = 0; i < sumMat.length; i++) {
            System.out.println(Arrays.toString(sumMat[i]));
        }

    }

    public static double[][] addTwoMatrices(double[][] mat1, double[][] mat2) {
        double[][] result = new double[mat1.length][mat1[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }
}
