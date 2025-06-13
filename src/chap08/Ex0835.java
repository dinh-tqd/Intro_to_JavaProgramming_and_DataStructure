package chap08;

import java.util.Scanner;
import java.util.Arrays;

public class Ex0835 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix: ");
        int size = input.nextInt();

        int[][] m = new int[size][size];
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[0].length; c++) {
                m[r][c] = (int)(Math.random() * 2);
            }
        }

//        int[][] m = {
//                {1,0,1,0,1},
//                {1,1,1,0,1},
//                {1,0,1,1,1},
//                {1,0,1,1,1},
//                {1,0,1,1,1},
//        };
//        int size = m.length;

        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println(Arrays.toString(findLargestBlock(m)));
    }

    public static int[] findLargestBlock(int[][] m) {
        int[] result = new int[3];

        outerLoop:
        for (int n = m.length; n >= 1; n--) {
            for (int r = 0; r + n - 1 < m.length; r++) {
                for (int c = 0; c + n - 1 < m.length; c++) {
                    if (testSquare(m, r, c, n)) {
                        result[0] = r;
                        result[1] = c;
                        result[2] = n;
                        break outerLoop;
                    }
                }
            }
        }
        return result;
    }


    public static boolean testSquare(int[][] m, int r, int c, int size) {
        for (int a = r; a <= r + size - 1; a++) {
            for (int b = c; b <= c + size - 1; b++) {
                if (m[a][b] != m[r][c] ) return false;
            }
        }
        return true;
    }
}

// Khi nào học ArrayList thì quay trở lại bài này và tìm tất cả các hình vuông có kích cỡ lớn nhất đó.