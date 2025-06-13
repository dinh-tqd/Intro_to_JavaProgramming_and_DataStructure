package chap10;

import java.math.BigInteger;

public class Ex1018_betterTry {
    public static void main(String[] args) {
        BigInteger number = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);

        int count = 0;
        while (count < 5) {
            if (number.isProbablePrime(50)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}
