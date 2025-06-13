package chap11;

import java.util.Scanner;
import java.util.ArrayList;


public class Ex1111 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // If you want to input 5 number to list instead
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            int number = input.nextInt();
//            list.add(number);
//        }

        for (int i = 0; i < 10; i++) {
            int number = (int)(Math.random() * 10) + 1;
            list.add(number);
        }

        System.out.println(list);
        sort(list);
        System.out.println(list);
    }

    public static void sort(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
