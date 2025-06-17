package chap13.ex1301;

public class Triangle extends GeometricObject {
    double side1;
    double side2;
    double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        this(side1, side2, side3);
        setColor(color);
        setFilled(filled);
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * ( p - side2) * (p - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3 ;
    }
}
