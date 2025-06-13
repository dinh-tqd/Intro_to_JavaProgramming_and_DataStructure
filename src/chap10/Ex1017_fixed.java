package chap10;

import java.math.BigInteger;

public class Ex1017_fixed {
    public static void main(String[] args) {
        BigInteger number = BigInteger.valueOf((long) (Math.sqrt(Long.MAX_VALUE)));

        for (int i = 1; i <= 10; i++) {
            System.out.println(number.multiply(number));
            number = number.add(BigInteger.ONE);
        }
    }
}
