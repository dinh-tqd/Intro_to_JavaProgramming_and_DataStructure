package chap07;

import java.util.Arrays;

public class Ex0727 {
    public static void main(String[] args) {
        int[] list1 = {5,2,5,6,6,1};
        int[] list2 = {5,2,5,6,1,6};
        System.out.println(looselyEquals(list1, list2));
    }

    public static boolean looselyEquals(int[] list1, int[] list2) {
        boolean result = true;
        int[] list1Content = Arrays.copyOf(list1, list1.length);
        Arrays.sort(list1Content);
        int[] list2Content = Arrays.copyOf(list2, list2.length);
        Arrays.sort(list2Content);

        return strictlyEquals(list1Content, list2Content);
    }

    public static boolean strictlyEquals(int[] list1, int[] list2) {
        boolean result = true;
        int i = 0;
        if (list1.length != list2.length) {
            result = false;
        } else while (i < list1.length && result) {
            if (list1[i] != list2[i]) {
                result = false;
            }
            i++;
        }
        return result;
    }
}
