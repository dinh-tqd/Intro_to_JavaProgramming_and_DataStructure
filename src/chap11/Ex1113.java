package chap11;

import java.util.ArrayList;

public class Ex1113 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int number = (int)(Math.random() * 10) + 1;
            list.add(number);
        }
        System.out.println(list);
        removeDuplicate(list);
        System.out.println(list);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).equals(list.get(i))) {
                    list.remove(j);
                    j--;
                }
            }
        }
    }
}
