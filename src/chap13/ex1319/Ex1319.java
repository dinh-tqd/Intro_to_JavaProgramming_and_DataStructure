package chap13.ex1319;

import java.math.BigInteger;
import java.util.Scanner;
import java.lang.StringBuilder;

public class Ex1319 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your decimal number: ");
        String inputNumber = input.nextLine().trim();

        StringBuilder intPart =  new StringBuilder();
        StringBuilder fractionalPart = new StringBuilder();
        int decimalPointLocation = -1;

        boolean isNegative = false;
        if (inputNumber.charAt(0) == '-') {
            isNegative = true;
        }

        for (int i = 0; i < inputNumber.length(); i++) {
            if (inputNumber.charAt(i) == '-') {
                continue;
            } else if (decimalPointLocation == -1 && inputNumber.charAt(i) != '.') {
                intPart.append(inputNumber.charAt(i));
            } else if (inputNumber.charAt(i) == '.') {
                decimalPointLocation = i;
            } else {
                fractionalPart.append(inputNumber.charAt(i));
            }
        }

        if (intPart.length() == 0) {
            intPart.append("0");
        }

        if (fractionalPart.length() == 0) {
            fractionalPart.append("0");
        }

//        System.out.println("Int part: " + intPart);
//        System.out.println("Fractional part: " + fractionalPart);
//        System.out.println("Number count in fractional part: " + fractionalPart.length());

        Rational r1 = new Rational(new BigInteger(intPart.toString()), BigInteger.ONE);
        Rational r2 = new Rational(new BigInteger(fractionalPart.toString()), BigInteger.TEN.pow(fractionalPart.length()));
        Rational r = r1.add(r2);

        Rational result;
        if (!isNegative)
            result = r;
        else {
            result = new Rational(r.getNumerator().negate(), r.getDenominator());
        }

        System.out.println("The fraction number is : " + result);
        System.out.println("Decimal value : " + result.doubleValue());
    }
}
