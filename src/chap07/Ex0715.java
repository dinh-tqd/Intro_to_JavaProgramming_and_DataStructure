package chap07;

import java.util.Scanner;
import java.util.Arrays;

public class Ex0715 {
    public static void main(String[] args) {
        int[] list = {1,2,3,2,1,6,3,4,5,2};
        System.out.println(Arrays.toString(eliminateDuplicates(list)));
    }

    public static int[] eliminateDuplicates(int[] list) {
        int distinctCount = 0;
        boolean[] isDuplicate = new boolean[list.length];

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (!isDuplicate[j] && list[j] == list[i]) {
                    isDuplicate[j] = true;
                }
            }
            if (!isDuplicate[i]) {
                distinctCount++;
            }
        }

        int[] result = new int[distinctCount];
        int a = 0;
        for (int i = 0; i < list.length; i++) {
            if (!isDuplicate[i]) {
                result[a] = list[i];
                a++;
            }
        }
        return result;
    }
}
