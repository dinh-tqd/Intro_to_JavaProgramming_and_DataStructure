package chap07;

import java.util.Arrays;

public class Ex0731 {
    public static void main(String[] args) {
        int[] list1 = {1,5,16,61,111};
        int[] list2 = {2,4,5,6};

        System.out.println(Arrays.toString(merge(list1, list2)));
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] mergeList = new int[list1.length + list2.length];
        int indexMergeList = 0;
        int indexList1 = 0;
        int indexList2 = 0;

        while (indexList1 < list1.length && indexList2 < list2.length) {
            if (list1[indexList1] <= list2[indexList2]) {
                mergeList[indexMergeList] = list1[indexList1];
                indexList1++;
            } else {
                mergeList[indexMergeList] = list2[indexList2];
                indexList2++;
            }
            indexMergeList++;
        }

        while (indexList1 < list1.length) {
            mergeList[indexMergeList++] = list1[indexList1++];
        }

        while (indexList2 < list2.length) {
            mergeList[indexMergeList++] = list2[indexList2++];
        }

        return mergeList;
    }
}
