package chap10;

import java.math.BigInteger;

public class Ex1018 {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);

        BigInteger number = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
        System.out.println(number);

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

//        9223372036854775837
//        9223372036854775907
//        9223372036854775931
//        9223372036854775939
//        9223372036854775963