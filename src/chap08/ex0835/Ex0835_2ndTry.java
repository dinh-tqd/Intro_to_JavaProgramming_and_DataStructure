package chap08.ex0835;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0835_2ndTry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows in the matrix: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter the matrix row by row: ");
        for (int[] r : matrix) {
            for (int i = 0; i < r.length; i++) {
                r[i] = input.nextInt();
            }
        }

//        1 0 1 0 1
//        1 1 1 0 1
//        1 0 1 1 1
//        1 0 1 1 1
//        1 0 1 1 1

        System.out.println(Arrays.toString(findLargestBlock(matrix)));
    }

    public static int[] findLargestBlock(int[][] m) {
        int rIndex = -1;
        int cIndex = -1;
        int size = -1;

        for (int x = m.length; x >= 1; x-- ) {
            for (int r = 0; r + x - 1 <= m.length - 1; r++) {
                for (int c = 0; c + x - 1<= m[r].length - 1; c++) {
                    int count = 0;
                    loop:
                    for (int a = r; a <= r + x - 1; a++) {
                        for (int b = c; b <= c + x - 1; b++) {
                            if (m[a][b] != 1) {
                                break loop;
                            } else {
                                count++;
                            }
                        }
                    }
                    if (count == x * x) {
                        return new int[] {r, c, x};
                    }
                }
            }
        }

        return new int[] {rIndex, cIndex, size};
    }
}
