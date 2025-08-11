package test2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Test {
    // 264414864639329557497913717698145082779489/2788815009188499086581352357412492142272

    public static void main(String[] args) {
        BigInteger n1 = new BigInteger("264414864639329557497913717698145082779489");
        BigInteger n2 = new BigInteger("2788815009188499086581352357412492142272");

        BigDecimal d1 = new BigDecimal(n1);
        BigDecimal d2 = new BigDecimal(n2);

        int scale = 50;
        System.out.println(d1.divide(d2, scale, RoundingMode.FLOOR));
    }
}

