package chap13.ex1312;

public class Octagon extends GeometricObject
        implements Comparable<Octagon>, Cloneable {
    private double side;

    public Octagon() {
        this(0);
    }

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side * (2 + 4 / Math.sqrt(2));
    }

    @Override
    public double getPerimeter() {
        return side * 8;
    }

    @Override
    public int compareTo(Octagon o) {
        return Double.compare(this.side, o.side);
    }

    @Override
    public Octagon clone() {
        try {
            return (Octagon) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
