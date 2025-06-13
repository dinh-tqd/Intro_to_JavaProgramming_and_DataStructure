package chap10;

import java.math.BigInteger;

public class Ex1018_Test {
    public static void main(String[] args) {
        BigInteger number = new BigInteger("9223372036854775807");
        System.out.println(number.isProbablePrime(100));
    }
}
