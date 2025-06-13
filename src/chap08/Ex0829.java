package chap08;

import java.util.Scanner;
import java.util.Arrays;

public class Ex0829 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] m1 = new int[3][3];
        System.out.println("Enter list1: ");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                m1[r][c] = input.nextInt();
            }
        }

        int[][] m2 = new int[3][3];
        System.out.println("Enter list2: ");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                m2[r][c] = input.nextInt();
            }
        }

        int[] list1 = sortedListOfElements(m1);
        int[] list2 = sortedListOfElements(m2);
        System.out.println(compareTwoLists(list1, list2));

    }

    public static int[] sortedListOfElements (int[][] m) {
        int[] result = new int[m.length * m[0].length];
        int count = 0;
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[0].length; c++) {
                result[count] = m[r][c];
                count++;
            }
        }

        Arrays.sort(result);
        return result;
    }

    public static boolean compareTwoLists(int[] list1, int[] list2) {
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) return false;
        }
        return true;
    }
}
