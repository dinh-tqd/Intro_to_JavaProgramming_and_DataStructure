package chap10;

import java.math.*;
import java.math.BigInteger;
import java.math.BigDecimal;

public class Ex1020 {
    public static void main(String[] args) {
        System.out.println(factorial(BigInteger.valueOf(9)));

        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal(factorial(BigInteger.TEN));
        BigDecimal c = a.divide(b, 50, RoundingMode.HALF_UP);
        System.out.println(c);
    }

    public static BigInteger factorial(BigInteger n) {
        BigInteger result = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            result = result.multiply(i);
        }
        return result;
    }
}


