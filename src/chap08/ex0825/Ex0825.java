package chap08.ex0825;

public class Ex0825 {
    public static void main(String[] args) {
//        true case
//        double[][] m = {
//                {0.15, 0.875, 0.375},
//                {0.55, 0.005, 0.225},
//                {0.3, 0.12, 0.4},
//        };

//        false case
        double[][] m = {
                {0.95, -0.875, 0.375 },
                {0.65, 0.005, 0.225},
                {0.3, 0.22, -0.4},
        };

        System.out.println(isMarkovMatrix(m));
    }

    public static boolean isMarkovMatrix(double[][] m) {
        for (int c = 0; c < m[0].length; c++) {
            double columnSum = 0;
            for (int r = 0; r < m.length; r++) {
                if (m[r][c] < 0) return false;
                columnSum += m[r][c];
            }
            if (columnSum != 1) return false;
        }
        return true;
    }
}
