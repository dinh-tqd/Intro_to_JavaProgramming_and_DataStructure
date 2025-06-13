package chap11;

import java.util.Arrays;
import java.util.ArrayList;

public class Ex1114 {
    public static void main(String[] args) {
        Integer[] array1 = {3,5,45,4,3};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
        System.out.println(list1);
        Integer[] array2 = {33,51,5,4,13};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
        System.out.println(list2);
        System.out.println(union(list1, list2));
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list = new ArrayList<>();
        if (list1 != null && list1.size() != 0) {
            for (int i = 0; i < list1.size(); i++) {
                list.add(list1.get(i));
            }
        }
        if (list2 != null && list2.size() != 0) {
            for (int i = 0; i < list2.size(); i++) {
                list.add(list2.get(i));
            }
        }
        return list;
    }
}


