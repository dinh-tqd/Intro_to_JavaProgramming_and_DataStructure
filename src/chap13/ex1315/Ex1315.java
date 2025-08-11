package chap13.ex1315;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex1315 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first Rational Number");
        BigInteger r1Numerator = input.nextBigInteger();
        BigInteger r1Denominator = input.nextBigInteger();
        Rational r1 = new Rational(r1Numerator, r1Denominator);

        System.out.println("Enter the second Rational Number");
        BigInteger r2Numerator = input.nextBigInteger();
        BigInteger r2Denominator = input.nextBigInteger();
        Rational r2 = new Rational(r2Numerator, r2Denominator);

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r1 + " is " + r1.doubleValue());
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
