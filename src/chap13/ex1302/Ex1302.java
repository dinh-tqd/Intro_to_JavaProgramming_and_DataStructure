package chap13.ex1302;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Ex1302 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2.0);
        list.add(new BigInteger("123456789123"));
        list.add(new BigDecimal("3.12222222222222222222"));
        list.add(6);
        list.add(new BigInteger("12323532512352352523"));

        System.out.println(list);
        shuffle(list);
        System.out.println(list);


    }

    public static void shuffle(ArrayList<Number> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            int randomSwapIndex = (int)(Math.random() * i);

            Number temp = list.get(i);
            list.set(i, list.get(randomSwapIndex));
            list.set(randomSwapIndex, temp);
        }
    }
}


