package chap13.ex1314;

public class Rational extends Number implements Comparable<Rational>{
    private long[] r = new long[2];

    public Rational() {
        r[0] = 0;
        r[1] = 1;
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        r[0] = (denominator > 0 ? 1 : -1) * numerator / gcd;
        r[1] = Math.abs(denominator) / gcd;
    }

    public long getNumerator() {
        return r[0];
    }

    public long getDenominator() {
        return r[1];
    }

    public Rational add(Rational secondRational) {
        long rNumerator = r[0] * secondRational.getDenominator() + r[1] * secondRational.getNumerator();
        long rDenominator = r[1] * secondRational.getDenominator();
        return  new Rational(rNumerator, rDenominator);
    }

    public Rational subtract(Rational secondRational) {
        long rNumerator = r[0] * secondRational.getDenominator() - r[1] * secondRational.getNumerator();
        long rDenominator = r[1] * secondRational.getDenominator();
        return  new Rational(rNumerator, rDenominator);
    }

    public Rational multiply(Rational secondRational) {
        long rNumerator = r[0] * secondRational.getNumerator();
        long rDenominator = r[1] * secondRational.getDenominator();
        return  new Rational(rNumerator, rDenominator);
    }

    public Rational divide(Rational secondRational) {
        long rNumerator = r[0] * secondRational.getDenominator();
        long rDenominator = r[1] * secondRational.getNumerator();
        return  new Rational(rNumerator, rDenominator);
    }

    private static long gcd (long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);

        if (n1 == 0)
            return n2;
        if (n2 == 0)
            return n;

        if (n1 > n2)
            return gcd(n2, n1 % n2);
        else
            return gcd(n2 % n1, n1);
    }

    @Override
    public String toString() {
        if (r[1] == 1)
            return r[0] + "";
        return r[0] + "/" + r[1];
    }

    @Override
    public boolean equals(Object o) {
        if ((this.subtract((Rational) o)).getNumerator() == 0) {
            return true;
        }
        return false;
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
        return r[0] * 1.0 / r[1];
    }

    @Override
    public long longValue() {
        return (long)doubleValue();
    }

    @Override
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator() == 0) {
            return 0;
        } else if (this.subtract(o).getNumerator() < 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
