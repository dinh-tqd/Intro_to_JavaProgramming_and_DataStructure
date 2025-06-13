package chap10;

import java.math.BigInteger;

public class Ex1016 {
    public static void main(String[] args) {
        BigInteger number = BigInteger.TEN.pow(50);

        System.out.println(number.remainder(BigInteger.valueOf(3)));
        int count = 0;
        while (count < 50) {
            boolean condition =
                    number.remainder(BigInteger.valueOf(2)).equals(BigInteger.ZERO)
                    || number.remainder(BigInteger.valueOf(3)).equals(BigInteger.ZERO);

            if (condition) {
                System.out.println(number.toString());
                count++;
            }

            number = number.add(BigInteger.ONE);
        }
    }
}
