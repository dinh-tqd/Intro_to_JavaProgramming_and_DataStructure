package chap13.ex1319;

import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational>, Cloneable{
    private BigInteger numerator;
    private BigInteger denominator;

    public Rational() {
        numerator = BigInteger.ZERO;
        denominator = BigInteger.ONE;
    }

    public Rational(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = gcd(numerator, denominator);
        this.numerator = (denominator.compareTo(BigInteger.ZERO) > 0 ? BigInteger.ONE : BigInteger.valueOf(-1)).multiply(numerator).divide(gcd);
        this.denominator = denominator.abs().divide(gcd);
    }

    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    public Rational add(Rational secondRational) {
        BigInteger rNumerator = (numerator.multiply(secondRational.getDenominator())).add(denominator.multiply(secondRational.getNumerator()));
        BigInteger rDenominator = denominator.multiply(secondRational.getDenominator());
        return  new Rational(rNumerator, rDenominator);
    }

    public Rational subtract(Rational secondRational) {
        BigInteger rNumerator = (numerator.multiply(secondRational.getDenominator())).subtract(denominator.multiply(secondRational.getNumerator()));
        BigInteger rDenominator = denominator.multiply(secondRational.getDenominator());
        return  new Rational(rNumerator, rDenominator);
    }

    public Rational multiply(Rational secondRational) {
        BigInteger rNumerator = numerator.multiply(secondRational.getNumerator());
        BigInteger rDenominator = denominator.multiply(secondRational.getDenominator());
        return  new Rational(rNumerator, rDenominator);
    }

    public Rational divide(Rational secondRational) {
        BigInteger rNumerator = numerator.multiply(secondRational.getDenominator());
        BigInteger rDenominator = denominator.multiply(secondRational.getNumerator());
        return  new Rational(rNumerator, rDenominator);
    }

    private static BigInteger gcd (BigInteger n, BigInteger d) {
        BigInteger n1 = n.abs();
        BigInteger n2 = d.abs();

        if (n1.equals(BigInteger.ZERO))
            return n2;
        if (n2.equals(BigInteger.ZERO))
            return n1;

        if (n1.compareTo(n2) > 0)
            return gcd(n1.mod(n2), n2);
        else
            return gcd(n1, n2.mod(n1));
    }

    @Override
    public String toString() {
        if (denominator.equals(BigInteger.ONE))
            return numerator + "";
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object o) {
        return (this.subtract((Rational) o)).getNumerator().equals(BigInteger.ZERO);
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }

    @Override
    public long longValue() {
        return (long)doubleValue();
    }

    @Override
    public int compareTo(Rational o) {
        return this.subtract(o).getNumerator().compareTo(BigInteger.ZERO);
    }

    @Override
    public Rational clone() {
        return new Rational(this.numerator, this.denominator);
    }
}
