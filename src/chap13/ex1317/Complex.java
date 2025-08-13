package chap13.ex1317;

public class Complex implements Comparable<Complex>, Cloneable{
    private double real;
    private double i;

    public Complex() {
        this(0,0);
    }

    public Complex(double real) {
        this(real, 0);
    }

    public Complex(double real, double i) {
        this.real = real;
        this.i = i;
    }

    public double getReal() {
        return real;
    }

    public double getI() {
        return i;
    }

    public Complex add(Complex o) {
        return new Complex(this.real + o.getReal(), this.i + o.getI());
    }

    public Complex subtract(Complex o) {
        return new Complex(this.real - o.getReal(), this.i - o.getI());
    }

    public Complex multiply(Complex o) {
        double newReal = this.real * o.getReal() - this.i * o.getI();
        double newI = this.i * o.getReal() + this.real * o.getI();
        return new Complex(newReal, newI);
    }

    public Complex divide(Complex o) {
        double newReal = (this.real * o.getReal() + this.i * o.getI()) / (o.getReal() * o.getReal() + o.getI() * o.getI());
        double newI = (this.i * o.getReal() - this.real * o.getI()) / (o.getReal() * o.getReal() + o.getI() * o.getI());
        return new Complex(newReal, newI);
    }

    public double abs() {
        return Math.sqrt(this.getReal() * this.getReal() + this.getI() * this.getI());
    }

    @Override
    public String toString() {
        if (this.i == 0) {
            return this.real + "";
        } else if (this.real == 0) {
            return this.i + "";
        }
        return this.real + " + " + this.i + "i";
    }

    @Override
    public int compareTo(Complex o) {
        return Double.compare(this.abs(), o.abs());
    }

    @Override
    public Complex clone() {
        return new Complex(this.real, this.i);
    }
}