package chap10;

import java.math.BigInteger;

public class Ex1021 {
    public static void main(String[] args) {
        BigInteger number = BigInteger.valueOf(Long.MAX_VALUE);
        number = number.add(BigInteger.ONE);


        int count = 1;
        while (count <= 10) {
            boolean condition =
                    number.remainder(BigInteger.valueOf(5)).equals(BigInteger.ZERO) ||
                            number.remainder(BigInteger.valueOf(6)).equals(BigInteger.ZERO);
            if (condition) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}
