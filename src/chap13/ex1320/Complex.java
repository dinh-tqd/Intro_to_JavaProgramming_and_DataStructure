package chap13.ex1320;

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

    public double getRealPart() {
        return real;
    }

    public double getImaginaryPart() {
        return i;
    }

    public Complex add(Complex o) {
        return new Complex(this.real + o.getRealPart(), this.i + o.getImaginaryPart());
    }

    public Complex subtract(Complex o) {
        return new Complex(this.real - o.getRealPart(), this.i - o.getImaginaryPart());
    }

    public Complex multiply(Complex o) {
        double newReal = this.real * o.getRealPart() - this.i * o.getImaginaryPart();
        double newI = this.i * o.getRealPart() + this.real * o.getImaginaryPart();
        return new Complex(newReal, newI);
    }

    public Complex divide(Complex o) {
        double newReal = (this.real * o.getRealPart() + this.i * o.getImaginaryPart()) / (o.getRealPart() * o.getRealPart() + o.getImaginaryPart() * o.getImaginaryPart());
        double newI = (this.i * o.getRealPart() - this.real * o.getImaginaryPart()) / (o.getRealPart() * o.getRealPart() + o.getImaginaryPart() * o.getImaginaryPart());
        return new Complex(newReal, newI);
    }

    public double abs() {
        return Math.sqrt(this.getRealPart() * this.getRealPart() + this.getImaginaryPart() * this.getImaginaryPart());
    }

    @Override
    public String toString() {
        if (this.i == 0) {
            return this.real + "";
        } else if (this.real == 0) {
            return this.i + "i";
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