package chap11;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex1104 {
    public static void main(String[] args) {
        Integer[] array = {1, 3 ,5 ,7 ,2, 4, 6};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

//        Test với list là null
//        ArrayList<Integer> list = null;
        System.out.println(max(list));
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0)
            return null;

        Integer max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}
