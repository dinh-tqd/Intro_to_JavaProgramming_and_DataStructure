package chap13.ex1318;

import java.math.BigInteger;

public class Ex1318 {
    public static void main(String[] args) {
        Rational sum = new Rational();
        for (int count = 1; count <= 99; count++) {
            sum = sum.add(new Rational(BigInteger.valueOf(count), BigInteger.valueOf(count + 1)));
        }

        System.out.println(sum);

        System.out.println(sum.doubleValue());

        double sum2 = 0;
        for (int count = 1; count <= 99; count++) {
            sum2 += ((double)count) / (double)(count + 1);
        }
        System.out.println(sum2);
    }
}
