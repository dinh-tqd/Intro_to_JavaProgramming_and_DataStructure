package chap11;

import java.util.ArrayList;

public class Ex1112 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            double number = Math.random() * 10;
            list.add(number);
        }
        System.out.println(list);
        System.out.println(sum(list));
    }

    public static double sum(ArrayList<Double> list) {
        if (list == null || list.size() == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
