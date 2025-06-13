package chap11;

import java.util.Arrays;
import java.util.ArrayList;

public class Ex1107 {
    public static void main(String[] args) {
        Integer[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        shuffle(list);
        System.out.println(list);
    }

    public static void shuffle(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int j = i + (int) (Math.random() * (list.size() - i)); // j ∈ [i, list.size() - 1]

            Integer temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}
