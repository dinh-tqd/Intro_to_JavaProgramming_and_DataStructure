package chap13.ex1305;

import java.awt.*;
import java.util.Arrays;

public class Triangle extends GeometricObject implements Comparable<GeometricObject> {
    private double side1;
    private double side2;
    private double side3;

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

    public double[] getSides() {
        return new double[]{side1, side2, side3};
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public boolean isValidTriangle() {
        boolean condition1 = side1 + side2 > side3;
        boolean condition2 = side2 + side3 > side1;
        boolean condition3 = side1 + side2 < side3;
        return condition1 && condition2 && condition3;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()
                + "\nSides: " + Arrays.toString(this.getSides())
                + "\nCreated on " + dateCreated + "\ncolor: " + this.getColor()  + " and filled: " + this.isFilled();
    }

    @Override
    public int compareTo(GeometricObject o) {
        return (Double.compare(this.getArea(), o.getArea()));
    }
}
