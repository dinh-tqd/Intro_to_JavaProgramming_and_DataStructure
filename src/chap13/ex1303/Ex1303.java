package chap13.ex1303;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Ex1303 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2.0);
        list.add(new BigInteger("123456789123"));
        list.add(new BigDecimal("3.12222222222222222222"));
        list.add(6);
        list.add(new BigInteger("12323532512352352523"));

        System.out.println(list);
        sort(list);
        System.out.println(list);
    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).doubleValue() > list.get(j).doubleValue()) {
                    Number temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
