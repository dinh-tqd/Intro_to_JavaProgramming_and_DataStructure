package chap10;

import java.math.BigInteger;

public class Ex1017 {
    public static void main(String[] args) {
        BigInteger number = BigInteger.valueOf(Long.MAX_VALUE);

        int count = 0;
        while (count < 5) {
            int divisorCount = 0;
            for (BigInteger i = BigInteger.TWO; i.multiply(i).compareTo(number) <= 0; i = i.add(BigInteger.ONE)) {
                if (number.remainder(i).equals(BigInteger.ZERO)) {
                    divisorCount++;
                    break;
                }
            }
            if (divisorCount == 0) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}
