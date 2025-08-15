package chap08.ex0814;

public class Test {
    public static void main(String[] args) {
        int[][] m = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1},
        };
        Ex0814_2.checkRow(m);
        Ex0814_2.checkColumn(m);
        Ex0814_2.checkMajorDiagonal(m);
        Ex0814_2.checkSubDiagonal(m);
    }
}
