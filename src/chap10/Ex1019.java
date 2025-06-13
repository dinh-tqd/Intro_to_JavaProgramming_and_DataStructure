package chap10;

import java.math.BigInteger;

public class Ex1019 {
    public static final int DEFAULT_MAX = 100;
    public static void main(String[] args) {
        for (int p = 1; p <= DEFAULT_MAX; p++) {
            BigInteger number = BigInteger.TWO;
            for (int i = 1; i <= p; i++) {
                number = number.multiply(BigInteger.TWO);
            }
            number = number.subtract(BigInteger.ONE);
            if (number.isProbablePrime(50)) {
                System.out.printf("%3d", p);
                System.out.println("     " + number);
            }
        }
    }
}
